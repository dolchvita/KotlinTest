package com.snd.kotlintest.playground


fun main() {

    val a = General("민수", 182)
    println(a == General("민수", 182))
    println(a.hashCode())
    println(a)
    println("---------------------")

    /* toString() 기능 지원 */
    val b = Data("예서", 158)
    println(b == Data("예서", 158))
    println(b.hashCode())
    println(b)
    println("---------------------")
    println(b.copy())
    println(b.copy("민수"))
    println(b.copy(id = 180))



    /* componentX() 기능 지원 */
    val list = listOf(Data("a", 1),
        Data("b", 2),
        Data("c", 3))

    for((a, b) in list){
        println("${a}, ${b}")
    }

}


class General(val name: String, val id: Int)

data class Data(val name: String, val id: Int)
/* 데이터 클래스 내부 기능 지원
 * 1. equals()
   2. hashcode()
   3. toString()
   4. copy()
   5. componentX()
 */
