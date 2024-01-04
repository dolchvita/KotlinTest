package com.snd.kotlintest.playground


fun main() {

    deliveryItem("아이템")
    deliveryItem("선물", destination = "민수씨네 집")  // 특정 파라미터 지정하기


    sum(1,2,3,4)


    println(6 multiply 4)
    println(6 multiply(4))  // 같은 표현

}



/* 매개변수를 3가지 받지만, 디폴트 값이 설정되어있어 값을 안 넣어도 실행 */
fun deliveryItem(name : String, count : Int = 1, destination : String = "집"){
    println("${name}, ${count}개를 ${destination}에 전달")
}


/* 매개변수 여러개를 배열처럼 묶어 받기 */
fun sum(vararg nums : Int){
    var sum = 0
    for(n in nums){
        sum += n
    }
    println(sum)
}


/* 첫 번째 매개변수 this, 두 번째 매개변수 x */
infix fun Int.multiply(x : Int) : Int = this * x

// --> infix 함수란 호출자인 .과 ()를 생략하고 함수명만으로 호출할 수 있는 코틀린 표현식
