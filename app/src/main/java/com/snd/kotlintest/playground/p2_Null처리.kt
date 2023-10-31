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
class Product(val name: String, val price: Int){
    override fun equals(other: Any?): Boolean{
        if(other is Product){
            return other.name == name && other.price == price
        }else{
            return false
        }
    }
}
