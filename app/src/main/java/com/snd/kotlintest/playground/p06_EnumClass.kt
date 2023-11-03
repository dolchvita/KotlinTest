package com.snd.kotlintest.playground


fun main() {

    var state = State.SING
    println(state)

    state = State.SLEEP
    println(state.isSleeping())

    // 인스턴스 생성없이 바로 참조 가능
}


enum class State(val message: String){
    SING("노래"),
    EAT("밥"),
    SLEEP("잠");

    fun isSleeping() = this == State.SLEEP
}
/* enum class는 마치 리스트나 배열처럼 여러가지 요소를 담는다.
*  이 안에 들어가는 요소들은 상수처럼 대문자로 표기한다. */
