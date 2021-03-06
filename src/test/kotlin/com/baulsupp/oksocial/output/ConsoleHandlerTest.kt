package com.baulsupp.oksocial.output

import com.baulsupp.oksocial.output.handler.ConsoleHandler
import com.baulsupp.oksocial.output.responses.ResponseExtractor
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.cbor.CBORFactory
import java.io.ByteArrayInputStream
import java.util.LinkedHashMap
import kotlinx.coroutines.runBlocking
import okio.BufferedSource
import okio.buffer
import okio.source
import org.junit.jupiter.api.Test

class ConsoleHandlerTest {
  @Test
  fun testCborSupport() {
    val cborMapper = ObjectMapper(CBORFactory())

    val s = LinkedHashMap<String, String>()
    s["a"] = "AAA"
    s["b"] = "BBB"
    val bytes = cborMapper.writeValueAsBytes(s)

    val extractor = object : ResponseExtractor<ByteArray> {
      override fun mimeType(response: ByteArray): String? {
        return "application/cbor"
      }

      override fun source(response: ByteArray): BufferedSource {
        return ByteArrayInputStream(response).source().buffer()
      }

      override fun filename(response: ByteArray): String {
        return "filename"
      }
    }
    val c = ConsoleHandler(extractor)
    runBlocking {
      c.showOutput(bytes)
    }
  }
}
