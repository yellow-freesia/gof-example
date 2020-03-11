package factory.concrete

import factory.framework.Item

class HpPotion : Item {
    override fun use() {
        println("체력 회복")
    }
}