
import kotlin.random.Random

fun main() {

    /**
     * Random 클래스를 사용하여 rnd 객체 선언 및 생성하기
     * KT 에서는 객체를 생성할때 new 키워드를 사용하지 않는다
     *
     * KT Random 은 객체를 생성할때 seed 값을 매개변수로 필요로 한다
     * seed 는 random 값을 생성할때 내부적으로 연산에 사용하는 값
     */
    var rnd:Random = Random(System.currentTimeMillis())

    // 난수 생성
    // 0 ~ 99까지 범위에서 한개의 정해지지 않은 수(임의의 수)를 생성한다
    var num1 = rnd.nextInt(100)

    print("생성된 난수 : $num1")
    
    // 생성된 난수가 짝수인가 홀수인가 판별
    if(num1 % 2 == 0) {
        println("$num1 은 짝수이다")
    } else {
        println("$num1 은 짝수가 아니다")
    }
    
    // 생성된 난수가 3의 배수인가 판별
    if(num1 % 3 == 0) {
        println("$num1 은 3의 배수이다")
    } else {
        println("$num1 은 3의 배수가 아니다")
    }

    /**
     * Kotlin 에서는 if 가 식(expression)
     * expression : 어떤 결과를 return 하는 연산식
     * 일반적인 3항 연산자처럼 if 를 사용하는 독특한 방법
    */
    var result:String = if(num1 % 2 == 0) "짝수" else "홀수"
    println("$num1 은 $result 이다")
    
    

    





}