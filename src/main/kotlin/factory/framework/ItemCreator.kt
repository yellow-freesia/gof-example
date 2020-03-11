package factory.framework

abstract class ItemCreator<out T : Item> {

    fun create(): T {
        requestItemInfo()
        val item = createItem()
        createItemLog()

        return item
    }

    // 아이템 생성 전에 데이터베이스에 아이템 정보를 요청합니다.
    protected abstract fun requestItemInfo()

    // 아이템을 생성 후 아이템 복제 등의 불법을 방지하기 위해 데이터베이스에 아이템 생성 기록을 남김.
    protected abstract fun createItemLog()

    // 아이템을 생성하는 알고리즘
    protected abstract fun createItem(): T
}