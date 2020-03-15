package builder

// Concrete Builder
class LgGramBuilder : ComputerBuilder() {

    private val model: String = "LG Gram"
    private lateinit var cpu: String
    private lateinit var ram: String
    private lateinit var storage: String

    fun getResult() = Computer(model, cpu, ram, storage)

    override fun setCpu(speed: String) {
        cpu = speed
    }

    override fun setRam(size: String) {
        ram = size
    }

    override fun setStorage(size: String) {
        storage = size
    }
}