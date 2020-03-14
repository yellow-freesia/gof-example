package singleton

class SystemSpeaker private constructor() {

    companion object {
        @Volatile
        private var instance: SystemSpeaker? = null

        @JvmStatic
        fun getInstance(): SystemSpeaker {
            return instance?.also { println("이미 생성") } ?: synchronized(this) {
                instance ?: SystemSpeaker().also { println("새 생성"); instance = it }
            }
        }
    }

    private var volume = 5
}