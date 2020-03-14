package singleton

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Test {

    @Test
    fun test() {
        val systemSpeaker1 = SystemSpeaker.getInstance()
        val systemSpeaker2 = SystemSpeaker.getInstance()

        assertThat(systemSpeaker2).isEqualTo(systemSpeaker1)
    }
}