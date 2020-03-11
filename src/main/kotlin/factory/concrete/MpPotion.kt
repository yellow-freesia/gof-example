package factory.concrete

import factory.framework.Item

class MpPotion : Item {
    override fun use() {
        println("마력 회복")
    }
}