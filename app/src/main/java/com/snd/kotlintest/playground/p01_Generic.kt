package com.snd.kotlintest.playground

fun main() {
    UsingGeneric(B()).doShouting()


    var intArr = arrayOfNulls<Int>(5)
}



// 기본적으로 상속 금지이므로 open 키워드 작성
open class A{
    open fun shout(){
        println("A 생성")
    }
}

class B: A(){
    override fun shout(){
        println("B 생성")
    }
}

// 제너릭 클래스
class UsingGeneric<T: A> (val t: T){
    fun doShouting(){
        t.shout()
    }
}

// 제너릭 함수
/* 수퍼클래스를 A로 제한한 제너릭 T 선언
 * 함수는 매개변수 앞에 따로 표시하지 않아도 되지만, 함수명 앞에 제너릭을 명시한다 */
fun <T: A> doShouting(t: T){
    t.shout()
}
