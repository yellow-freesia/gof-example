package strategy.delegate

import strategy._interface.Ainterface
import strategy._interface.AinterfaceImpl

class AObj {

    val ainterface: Ainterface

    constructor() {
        ainterface = AinterfaceImpl()
    }

    fun funcAA() {
        // 위임
        ainterface.funcA()
        ainterface.funcA()
    }
}