package ricardo.gradle.test.main

import javafx.concurrent.Task
import ricardo.gradle.test.kotlin.KotlinUtils
import ricardo.gradle.test.calculator2.Calculator2

class Application {
    static void main(String[] args) {
        Thread.sleep(5955)
        String fromKtProject = KotlinUtils.getString(Calculator2.multiply(10, 20).toBigDecimal())
        println(fromKtProject)
    }
}
