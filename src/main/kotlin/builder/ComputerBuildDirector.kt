package builder

// Director
class ComputerBuildDirector(private var builder: ComputerBuilder) {
    fun makeHighendComputer() {
        builder.setCpu("4GHz")
        builder.setRam("32GB")
        builder.setStorage("8TB")
    }

    fun makeMidendComputer() {
        builder.setCpu("2GHz")
        builder.setRam("16GB")
        builder.setStorage("4TB")
    }

    fun makeLowendComputer() {
        builder.setCpu("1GHz")
        builder.setRam("4GB")
        builder.setStorage("1TB")
    }
}
