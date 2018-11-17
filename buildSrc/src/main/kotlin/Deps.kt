object Versions {
  val jackson = "2.9.7"
  val kotlin = "1.3.10"
  val kotlinCoroutines = "1.0.1"
}

object Deps {
  val activation = "javax.activation:activation:1.1.1"
  val byteunits = "com.jakewharton.byteunits:byteunits:0.9.1"
  val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"
  val jacksonCbor = "com.fasterxml.jackson.dataformat:jackson-dataformat-cbor:${Versions.jackson}"
  val jacksonDatabind = "com.fasterxml.jackson.core:jackson-databind:${Versions.jackson}"
  val jacksonJdk8 = "com.fasterxml.jackson.datatype:jackson-datatype-jdk8:${Versions.jackson}"
  val jacksonJsr310 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310:${Versions.jackson}"
  val jacksonParams = "com.fasterxml.jackson.module:jackson-module-parameter-names:${Versions.jackson}"
  val jacksonYaml = "com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:${Versions.jackson}"
  val jfreesvg = "org.jfree:jfreesvg:3.3"
  val junitJupiterApi = "org.junit.jupiter:junit-jupiter-api:5.3.1"
  val junitJupiterEngine = "org.junit.jupiter:junit-jupiter-engine:5.3.1"
  val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
  val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
  val kotlinTest = "org.jetbrains.kotlin:kotlin-test:${Versions.kotlin}"
  val kotlinTestJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
  val okio = "com.squareup.okio:okio:2.1.0"
  val slf4jApi = "org.slf4j:slf4j-api:1.8.0-beta2"
  val slf4jJdk14 = "org.slf4j:slf4j-jdk14:1.8.0-beta2"
  val svgSalamander = "com.kitfox.svg:svg-salamander:1.0"
  val ztExec = "org.zeroturnaround:zt-exec:1.10"
}
