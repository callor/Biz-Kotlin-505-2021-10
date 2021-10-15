import java.lang.NumberFormatException
import java.util.*

val scan:Scanner = Scanner(System.`in`)

/**
 *
 * title:String = "임의의 " default 매개변수 선언
 * default 로 매개변수를 선언하면 함수를 호출할때
 * 값을 전달하지 않아도 된다
 * 값이 전달되지 않으면 default 설정된 값이 매개변수에
 * 전달된것과 같이 작동된다
 *
  */
fun inputNum(title:String = "임의의 "):Int {
    while(true) {
        print("$title 정수를 입력하세요 : ")
        val strNum:String = scan.nextLine()
        val intNum:Int = try{
            Integer.valueOf(strNum)
        } catch (e:Exception) {
            println("$title 정수는 정수값만 입력해야 합니다")
            continue
        }
        return intNum
    }
}

fun main() {

    while(true) {

        val intNum1:Int = inputNum("첫 번째")
        val intNum2:Int = inputNum("두 번재")

        if(intNum1 > intNum2) {
            println("첫 번째 정수값이 두 번째 보다 커야 합니다")
            continue
        }
        view(intNum1, intNum2)
        println("계속할까요 ? (Enter:계속, No:종료)")
        val endStr = scan.nextLine()
        if(endStr.equals("No")) break
    }
}

