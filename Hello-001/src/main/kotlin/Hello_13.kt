import kotlin.random.Random

fun main() {

    var num1:Int = Random.nextInt(100) + 1
    for(num in 0..num1) {
        print("$num, ")
    }
    println()

    for(num in 2..(num1 - 1)) {
        print("$num, ")
    }
    println()

    /**
     * 0 ~ 99까지 범위 중 임의로 생성되어 num1 에 저장된 숫자가
     * prime 수인지 판단하여 출력하시오
     * 1과 자기 자신 이외이 약수를 갖지 않는 수
     *
     * 2 ~ 자기자신-1 까지 범위의 숫자와 나누어
     * 나머지가 한번도 없는 숫자
     */





}