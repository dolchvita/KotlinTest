package com.snd.kotlintest.playground


/* 1. 반환값이 있는 함수는 자료형을 명시 */

fun add(a : Int, b : Int, c : Int) : Int{
    return a + b + c
}

// --> 더 단일 표현식

fun add2(a : Int, b : Int, c : Int) = a + b + c



/* 2. 다중 조건문 */

fun doWhen(a : Any){
    when(a){
        1 -> println("1")
    }
}

// --> 중복되는 조건은 효율적으로 !

fun doWhen2(a : Any){
    var result = when(a){
        1 -> "1"
        is Long -> "Long"
        else -> "else문은 필수"
    }
    println(result)
}



// 코틀린은 함수형 언어 !

fun main(){
    /* 3. 반복문 */

    for(i in 0..9){
        print(i)
    }



    /* 4. 클래스 */

    var a = Person("Yeseo", 1998)
    a.introduce()
}

// 코틀린의 클래스는 매개변수를 바로 지정하여 함수에 써먹을 수 있다.

class Person(var name : String, val birth : Int){
    fun introduce(){
        println("안녕하세요, ${birth}년생 ${name}입니다.")
    }
}

// --> 공통되는 조건은 생성자 활용하기

class Person2(var name : String, val birth : Int){
    init{
        println("안녕하세요, ${birth}년생 ${name}입니다.")
    }

    // --> 추가적으로 특정 매개변수를 고정하기

    constructor(name: String) : this(name, 1998)
}



/* 5. 스코프 함수
*
* - apply
* - run
* - with (run과 동일 but, 매개변수로 받아서 처리)
* - also
* - let
*
* 이것들은 실제 사용해봐야 감을 잡을 수 있을 것 같다. */



/* 6. 옵저버 패턴 */

interface EventListener{
    // 6-1) 이벤트가 발생하면 Int 값을 받는 인터페이스 정의
    fun onEvent(count : Int)
}

class Counter(var listener: EventListener){     // 6-2) 위에 정의한 인터페이스를 매개변수로 받는 클래스 정의
    // 5의 배수일 때마다 값 전달
    fun count(){
        for(i in 1..100){
            if(i % 5 == 0) listener.onEvent(i)
        }
    }
}

class EventPrinter : EventListener{
    override fun onEvent(count: Int) {
        println("${count} -")
    }
    // --> 6-3) 위에 정의한 리스너를 상속한 클래스가 onEvent 함수에 역할 부여
    // 두 재료를 연결할 클래스 정의 (인터페이스 상속하고, 오버라이드 함수 재정의)

    fun start(){
        val counter = Counter(this)
        counter.count()
    }
    // --> 6-4) 리스너를 매개변수로 받는 클래스를 생성한 후 count() 실행
}

fun main3(){
    // 6-5) 클래스 생성할 때는 () 잊지말 것!
    EventPrinter().start()
}
