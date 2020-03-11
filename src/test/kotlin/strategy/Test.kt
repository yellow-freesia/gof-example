package strategy

import org.junit.jupiter.api.Test
import strategy._interface.Ainterface
import strategy._interface.AinterfaceImpl
import strategy.delegate.AObj

class Test {

    @Test
    fun interfaceTest() {
        val ainterface: Ainterface = AinterfaceImpl()
        ainterface.funcA()
    }

    @Test
    fun delegateTest() {
        val aobj = AObj()
        aobj.funcAA()
    }

    @Test
    fun strategyPatternTest() {
        val gameCharacter = GameCharacter()

        gameCharacter.attack()

        gameCharacter.setWeapon(Knife())
        gameCharacter.attack()

        gameCharacter.setWeapon(Sword())
        gameCharacter.attack()

        gameCharacter.setWeapon(Axe())
        gameCharacter.attack()
    }
}