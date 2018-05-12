package com.baulsupp.oksocial.output

import okio.Okio
import okio.Sink
import java.io.File
import java.io.IOException

class DownloadHandler<in R>(
  private val responseExtractor: ResponseExtractor<R>,
  private val outputFile: File
) : OutputHandler<R> {

  override suspend fun showOutput(response: R) {
    val source = responseExtractor.source(response)

    val outputSink = getOutputSink(response)
    try {
      source.writeToSink(outputSink)
    } finally {
      if (!isStdout) {
        outputSink.close()
      }
    }
  }

  fun getOutputSink(response: R): Sink {
    return when {
      isStdout -> systemOut
      outputFile.isDirectory -> {
        val responseOutputFile = File(outputFile, responseExtractor.filename(response))
        System.err.println("Saving $responseOutputFile")
        Okio.sink(responseOutputFile)
      }
      else -> {
        if (outputFile.parentFile != null && !outputFile.parentFile.exists()) {
          if (!outputFile.parentFile.mkdirs()) {
            throw IOException("unable to create directory $outputFile")
          }
        }
        Okio.sink(outputFile)
      }
    }
  }

  val isStdout by lazy {
    outputFile.path == "-"
  }
}
