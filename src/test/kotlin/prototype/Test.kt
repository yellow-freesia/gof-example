package prototype

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Test {

    @Test
    fun test() {
        val circle1 = Circle(1, 2, 3)
        val circle2 = circle1.copy()

        assertThat(circle1.x + 1).isEqualTo(circle2.x)
        assertThat(circle1.y + 1).isEqualTo(circle2.y)
        assertThat(circle1.r).isEqualTo(circle2.r)
    }
}