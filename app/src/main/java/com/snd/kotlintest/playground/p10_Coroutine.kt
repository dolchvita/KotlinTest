package com.snd.kotlintest.playground

import kotlinx.coroutines.*
// 라이브러리 임포트


fun main() {

    /* 코루틴은 메인스레드를 잠시 제어하고 루틴의 대기를 위한 타이밍을 조절해야 함! */
    runBlocking{
        val a = launch{
            for(i in 1..5){
                println(i)

                delay(10)
            }
        }

        val b = async{
            "async 종료"
        }

        println("async 대기")
        println(b.await())  // Deferred의 실행이 끝날 때까지 대기

        println("-------------------------------")

        println("launch 대기")
        a.join()    // Job의 실행이 끝날 때까지 대기
        println("launch 종료")
    }

}
