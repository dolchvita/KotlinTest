package com.snd.kotlintest.playground


fun main() {

    val foodCourt = FoodCourt()
    foodCourt.searchPrice(FoodCourt.FOOD_PASTA)
    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)

}


class FoodCourt{

    fun searchPrice(foodName: String){
        val price = when(foodName){
            FOOD_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 15000
            else -> 0
        }

        println("${foodName}은 ${price}원 입니다.")
    }

    /* 상수는 일반 클래스나 함수에서 선언하지 못함 */
    companion object{
        const val FOOD_PASTA = "Pasta"
        const val FOOD_STEAK = "Steak"
        const val FOOD_PIZZA = "Pizza"
    }
    // 고정적인 값의 경우에는 초기화를 컴파일 시점에 미리 함으로써 성능을 향상시킬 수 있음

}
