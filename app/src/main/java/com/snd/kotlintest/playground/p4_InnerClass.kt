package com.snd.kotlintest.playground


fun main() {

    Outer.Nested().introduce()
    /* 클래스 객체를 호출할 때 () 여부의 차이는 ?
     * -> 생성자 호출 관련!
     * 생성자에 매개변수가 있다면 ()를 붙이고 해당 자료형 변수를 전달할 수 있음
     *
     * 즉,
     * 단순 클래스의 참조시 () 생략
     * 클래스 객체를 참조해서 메서드 호출 및 로직 수행시 ()로 인스턴스 생성해주기
     */

    val outer = Outer()
    val inner = outer.Inner()

    inner.introduceInner()
    inner.introduceOuter()

    outer.text = "Change Outer Class"
    inner.introduceOuter()

}


class Outer{
    var text = "Outer Class"	// 가변 변수

    class Nested{
        fun introduce(){
            println("Nested Class")
        }
    }	/* ./Nested */


    inner class Inner{
        var text = "Inner Class"

        fun introduceInner(){
            println(text)
        }

        fun introduceOuter(){
            println(this@Outer.text)
        }
    }	/* ./Inner */

}	/* ./Outer */
