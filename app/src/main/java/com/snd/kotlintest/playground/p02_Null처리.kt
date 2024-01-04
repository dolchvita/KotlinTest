package com.snd.kotlintest.playground

fun main() {

    // 자료형 뒤에 ?를 붙이면 null이 허용되는 변수로 선언할 수 있다!
    val nulString: String? = null


    var a = Product("sample", 1000)
    var b = Product("sample", 1000)
    var c = a

    println(a == b)     //true
    println(a === b)    //false
    println(a === c)    //true

}


// 이 클래스의 동작 방식은?

/* 두 개의 매개변수를 받아서 함수를 실행하는 클래스
* Any 클래스는 Java의 Object와 비슷한 개념 */

class Product(val name: String, val price: Int){
    override fun equals(other: Any?): Boolean{      // Any 클래스는 Java의 Object와 비슷한 개념
        if(other is Product){
            return other.name == name && other.price == price   // return 자리에 조건식으로 바로 적는구나!
        }else{
            return false
        }
    }
    /* --> equals()는 매개변수를 받아서 특정 자료형과 비교하여 같다면 true를 반환하는 기본 메서드 */

}
