package prototype

class Circle(var x: Int, var y: Int, var r: Int) : Shape() {

    fun copy(): Circle {
        return (clone() as Circle).apply { x++; y++ }
    }
}