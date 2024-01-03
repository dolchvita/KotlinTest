package com.snd.kotlintest.playground

import android.net.ConnectivityManager
import android.net.Network

fun main() {
    println("Hello, world!!!")
}



private val networkCallback: ConnectivityManager.NetworkCallback = object : ConnectivityManager.NetworkCallback() {

    // 네트워크가 연결되었을 때
    override fun onAvailable(network: Network) {
        super.onAvailable(network)
        //vm.isNetwork.set(true)
    }

    // 네트워크가 끊겼을 때
    override fun onLost(network: Network) {
        super.onLost(network)
        //vm.isNetwork.set(false)
    }

}

/* Kotlin의 특징
 *
 * 1. 함수형 언어
 * 변수 호출시 적용할 함수를 한 번에 적는다.
 * 반환 객체는? --> 현재 없음
 * 이 객체가 단일 인스턴스를 가지며, 그 자체가 반환값이 되기 때문
 *
 * 2. object
 * 단일 인스턴스를 갖는 익명 객체 생성
 * 주로 싱글톤 패턴이나 익명 객체의 필요한 경우 사용
 *
 * +) companion object와의 차이는?
 * companion object는 클래스 내부에 속한 정적 멤버를 정의하는 사용되고,
 * object는 익명 객체를 생성하여 단일 인스턴스를 만들거나 싱글톤 구현하는 데 사용됨.
 *
 * - 뭐든 미루지 않기 !
 *
 */
