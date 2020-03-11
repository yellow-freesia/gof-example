package templatemethod

abstract class AbstractGameConnectHelper {
    protected abstract fun doSecurity(str: String): String
    protected abstract fun authentication(id: String, password: String): Boolean
    protected abstract fun authorization(userName: String): Int
    protected abstract fun connection(info: String): String

    fun requestConnection(str: String): String {
        doSecurity(str)

        if (!authentication("id", "pw")) {
            throw Exception("id, password 불일치")
        }

        when (authorization("id")) {
            0 -> println("게임 매니저")
            1 -> println("유료 회원")
            2 -> println("무료 회원")
            3 -> println("권한 없음")
            else -> println("기타 상황")
        }

        return connection(str)
    }
}