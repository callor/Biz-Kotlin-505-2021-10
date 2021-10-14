import java.lang.NumberFormatException
import java.util.*

fun main() {

    var scan:Scanner = Scanner(System.`in`)

    /**
     * 키보드에서 정수값을 입력받아
     * 입력한 정수가 3의 배수인지를 판별하는 코드를 작성
     */

    print("정수값을 입력하세요 : ")
    var strNum:String = scan.nextLine()

    var intNum = 0
    try {
        intNum = Integer.valueOf(strNum)
    } catch (e:NumberFormatException) {
        println("정수값만 입력해주세요")
        return
    }

    if(intNum % 3 == 0) {
        println("$intNum 는 3의 배수")
    } else {
        println("$intNum 는 3의 배수가 아님")
    }

}