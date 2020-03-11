package factory.concrete

import factory.framework.ItemCreator
import java.time.LocalDateTime

class HpPotionCreator : ItemCreator<HpPotion>() {
    override fun requestItemInfo() {
        println("데이터베이스에서 체력 회복 물약의 정보를 가져옵니다.")
    }

    override fun createItemLog() {
        println("체력 회복 물약을 새로 생성했습니다. " + LocalDateTime.now())
    }

    override fun createItem(): HpPotion {
        return HpPotion()
    }
}