package com.snd.kotlintest.playground


fun main() {

    val a = LateInitExam()

    println(a.getLateInitText())    // 기본값
    a.text = "New Text"
    println(a.getLateInitText())    // New Text

    println("----------------------------")


    /* by lazy
       변수의 초기화를 실제 코드에서 사용할 시로 늦추는 기법 */
    val number: Int by lazy{
        println("초기화")
        7
    }
    println("코드 시작")
    println(number)	// 이시점에서 초기화
    println(number)

}


class LateInitExam(){
    lateinit var text: String

    fun getLateInitText(): String{
        /* 늦은 초기화 변수에 값이 할당이 되었는지 확인 후 조건에 따른 값 반환 */
        return if (::text.isInitialized) text else "기본값"
    }
}
