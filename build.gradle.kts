import org.springframework.boot.gradle.tasks.bundling.BootBuildImage

plugins {
    id("org.springframework.boot") version "3.3.2"
    id("io.spring.dependency-management") version "1.1.6"

    id("org.jlleitschuh.gradle.ktlint") version "12.1.1"
    id("com.palantir.git-version") version "3.1.0"

    kotlin("jvm") version "2.0.0"
    kotlin("plugin.spring") version "2.0.0"
}

val gitVersion: groovy.lang.Closure<String> by extra
version = gitVersion()

group = "com.alexaichinger"
version = "$version"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(22)
    }
}

springBoot {
    buildInfo()
}

repositories {
    mavenCentral()
    maven { url = uri("https://repo.spring.io/milestone") }
}

extra["springAiVersion"] = "1.0.0-M1"

configurations.all {
    exclude("org.springframework.boot", "spring-boot-starter-logging")
    exclude("ch.qos.logback", "logback-classic")
    exclude("org.apache.logging.log4j", "log4j-to-slf4j")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.springframework.ai:spring-ai-ollama-spring-boot-starter")
    implementation("org.springframework.session:spring-session-core")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testImplementation("org.springframework.security:spring-security-test")
    testImplementation("de.flapdoodle.embed:de.flapdoodle.embed.mongo.spring3x:4.16.1")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    implementation("org.springframework.boot:spring-boot-starter-log4j2")
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.ai:spring-ai-bom:${property("springAiVersion")}")
    }
}

kotlin {
    jvmToolchain(22)
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.named<Jar>("jar") {
    enabled = false
}

tasks.getByName<BootBuildImage>("bootBuildImage") {
    imageName = "alexaich/${project.name}"
    environment.set(
        mapOf("BP_JVM_VERSION" to "22"),
    )
}
