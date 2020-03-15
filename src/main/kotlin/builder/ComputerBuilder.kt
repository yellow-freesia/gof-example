package builder

// Abstract Builder
abstract class ComputerBuilder {
    abstract fun setCpu(model: String)
    abstract fun setRam(size: String)
    abstract fun setStorage(size: String)
}