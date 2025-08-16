pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        jcenter()
        maven { url = uri("https://jitpack.io") }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter()
        maven {
            url = uri("http://maven.xdja.com:8081/nexus3/repository/public/")
            // 显式允许该仓库使用不安全协议
            isAllowInsecureProtocol = true
        }
        maven { url = uri("https://jitpack.io") }
    }
}


rootProject.name = "NewBlackbox-3.0"
include(":app")
include(":Bcore")

