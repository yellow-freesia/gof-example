package builder

import org.junit.jupiter.api.Test

class Test {

    @Test
    fun test() {
        val builder = LgGramBuilder()
        val director: ComputerBuildDirector = ComputerBuildDirector(builder)

        director.makeHighendComputer()
        val highendComputer = builder.getResult()
        println(highendComputer)

        director.makeMidendComputer()
        val midendComputer = builder.getResult()
        println(midendComputer)

        director.makeLowendComputer()
        val lowendComputer = builder.getResult()
        println(lowendComputer)
    }
}