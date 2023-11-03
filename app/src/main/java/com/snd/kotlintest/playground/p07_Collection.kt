package com.snd.kotlintest.playground


fun main() {

    val nameList = listOf("코틀린1", "자바2", "안드로이드1", "인텔리제이2")

    nameList.forEach{
        print(it + " ")
    }

    println("----------------------------")
    println(nameList.filter{it.startsWith("코")})
    println(nameList.map{"이름 : " + it})
    println(nameList.any{it == "안드로이드1"})
    println(nameList.all{it.length == 6})
    println(nameList.none{it.startsWith("민")})
    println(nameList.count{it.contains("2")})
    println("----------------------------")


    val numbers = listOf(-3, 7, 2, 10, 1)

    println(numbers.flatMap{listOf(it * 10, it + 10)})	// 아이템 계산하여 컬렉션 반환
    println(numbers.getOrElse(1){50})
    println(numbers.getOrElse(10){50})
    println("----------------------------")

    val names = listOf("A", "B", "C", "D")

    println(names zip numbers)  // 두 컬렉션을 합침

}
