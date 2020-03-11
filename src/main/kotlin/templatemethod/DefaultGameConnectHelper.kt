package templatemethod

class DefaultGameConnectHelper : AbstractGameConnectHelper() {
    override fun doSecurity(str: String): String {
//        println("디코딩")
        println("강화된 암호화문 디코딩")
        return str
    }

    override fun authentication(id: String, password: String): Boolean {
        println("인증")
        return true
    }

    override fun authorization(userName: String): Int {
//        println("허가")
        println("나이를 확인하고 지금 시간을 확인한 후 허")
        return 0
    }

    override fun connection(info: String): String {
        println("접속")
        return info
    }
}