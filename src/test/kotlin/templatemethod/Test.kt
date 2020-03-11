package templatemethod

import org.junit.jupiter.api.Test

class Test {

    @Test
    fun test() {
        val helper: AbstractGameConnectHelper = DefaultGameConnectHelper()
        helper.requestConnection("")
    }
}