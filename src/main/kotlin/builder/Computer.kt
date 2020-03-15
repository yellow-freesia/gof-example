package builder

class Computer(val model: String, val cpu: String, val ram: String, val storage: String) {

    override fun toString(): String {
        return "$model: CPU=$cpu, RAM=$ram, Storage=$storage"
    }
}