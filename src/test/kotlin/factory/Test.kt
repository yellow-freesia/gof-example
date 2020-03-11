package factory

import factory.concrete.HpPotionCreator
import factory.concrete.MpPotionCreator
import org.junit.jupiter.api.Test

class Test {

    @Test
    fun test() {
        val hpCreator = HpPotionCreator()
        val hpItem = hpCreator.create()
        hpItem.use()

        val mpCreator = MpPotionCreator()
        val mpItem = mpCreator.create()
        mpItem.use()
    }
}