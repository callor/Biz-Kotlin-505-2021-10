import kotlin.random.Random

fun main() {

    val rnd = Random(System.currentTimeMillis())

    // 내용을 추가 삭제 변경이 가능한 배열
    val array = arrayListOf<Int>()

    // 1 ~ 100까지 임의 난수를 생성하여 array 에 100개 추가
    for(num in 1..100) {
        val rndNum = rnd.nextInt(100) + 1
        array.add(rndNum)
    }
    println("생성된 배열 : $array")

    var temp = arrayListOf<Int>()
    for(arr in array) {
        if(arr % 2 == 0) {
            temp.add(arr)
        }
    }

    // filter : array 배열에서 조건에 맞는 요소만 추출하여
    //      evens 배열에 담기
    // val evens = array.filter { arr-> arr % 2 == 0 } : lambda 방식

    // it 키워드를 사용하여 KT 고유방식으로
    val evens = array.filter { it % 2 == 0 }

    // 짝수의 합
    var evenSum = 0
    for(arr in evens) {
        evenSum += arr
    }
    println("배열 요소중 짝수들의 합 : $evenSum")

    val eventSum1 = array.sumOf { if(it % 2 == 0) it else 0 }
    println("배열 요소중 짝수들의 합 : $eventSum1")








}