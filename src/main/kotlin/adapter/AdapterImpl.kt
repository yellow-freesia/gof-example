package adapter

class AdapterImpl : Adapter {
    override fun twiceOf(f: Float): Float {
        return Math.twoTime(f.toDouble()).toFloat()
    }

    override fun halfOf(f: Float): Float {
        println("절반 함수 호출 시작")
        return Math.half(f.toDouble()).toFloat()
    }
}