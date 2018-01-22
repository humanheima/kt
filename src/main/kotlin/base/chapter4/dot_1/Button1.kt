package base.chapter4.dot_1

import java.io.Serializable

/**
 * Created by dumingwei on 2017/12/22 0022.
 */

interface State : Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

class Button1 : View {

    override fun getCurrentState(): State {
        return ButtonState()
    }

    override fun restoreState(state: State) {
        super.restoreState(state)
    }
    class ButtonState : State {

    }
}