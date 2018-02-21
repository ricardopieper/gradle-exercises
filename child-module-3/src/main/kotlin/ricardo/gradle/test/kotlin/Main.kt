package ricardo.gradle.test.kotlin

import java.math.BigDecimal

class KotlinUtils {
    companion object {
        @JvmStatic fun getString(value: BigDecimal) : String {
            return "From kotlin: " + value
        }
    }
}