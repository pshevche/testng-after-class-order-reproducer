plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.testng:testng:7.6.1")
    testImplementation("org.testng:testng:7.6.1")
}

tasks.named<Test>("test") {
    // Use TestNG for unit tests.
    useTestNG()
}
