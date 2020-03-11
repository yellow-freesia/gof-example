package adapter

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Test {

    @Test
    fun doubleTest() {
        val adapter: Adapter = AdapterImpl()
        val result = adapter.twiceOf(100f)
        println(result)
        assertThat(result).isEqualTo(200f)
    }

    @Test
    fun halfTest() {
        val adapter: Adapter = AdapterImpl()
        val result = adapter.halfOf(100f)
        println(result)
        assertThat(result).isEqualTo(50f)
    }
}