plugins {
    id("java")
    id("application")
}

group = "org.example"
"1.0-SNAPSHOT".also { version = it }

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/com.googlecode.lanterna/lanterna
    implementation (group= "com.googlecode.lanterna", name= "lanterna", version= "3.2.0-alpha1")

}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("Application")
}
// https://mvnrepository.com/artifact/com.googlecode.lanterna/lanterna
implementation group: 'com.googlecode.lanterna', name: 'lanterna', version: '3.1.1'

