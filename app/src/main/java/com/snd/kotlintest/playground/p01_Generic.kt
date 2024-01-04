package com.snd.kotlintest.playground

fun main() {
    /* 1-3) 제너릭이 선언된 클래스를 생성하고 --> 그 매개변수로 B 객체를 생성
        --> 재너릭 클래스 안에 있는 함수 사용 */
    UsingGeneric(B()).doShouting()


    var intArr = arrayOfNulls<Int>(5)
}



// 1-1) 기본적으로 상속 금지이므로 open 키워드 작성
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

// 1-2) 제너릭 클래스 - 한마디로 자료형이 고정된 매개변수값을 받겠다는 거 아냐
class UsingGeneric<T: A> (val t: T){
    fun doShouting(){
        t.shout()
    }
}
/* --> 즉, 자료형이 A인 매개변수를 받아서 doShouting()를 호출하는데, 그 함수는
*       A가 가지고 있는 shout()를 호출한다.  */



// 제너릭 함수
/* 수퍼클래스를 A로 제한한 제너릭 T 선언
 * 함수는 매개변수 앞에 따로 표시하지 않아도 되지만, 함수명 앞에 제너릭을 명시한다 */
fun <T: A> doShouting(t: T){
    t.shout()
}
// --> 이 함수는 여기서 사용이 되는 건 아니고, 이런식으로 자료형이 고정된 매개변수를 받을 수 있다.