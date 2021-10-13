fun main() {

    /**
     * var : 내용을 변경가능한 변수
     * val : 한번 저장되면 내용을 변경 불가능한 변수
     */
    val str1 = "Korea"
    // str1 = "Republic of Korea" : 오류 발생

    // listOf() 리스트형 변수를 생성하는 함수
    val 과일들 = listOf("사과","바나나","오렌지")
    for(과일 in 과일들) {
        println(과일)
    }

    for(index in 과일들.indices) {
        println("$index 번째 : ${과일들[index]}")
    }

    if( 3 in 1..10) {
        println("있어")
    }
    for(num in 1..10) {
        if(num == 3) {
            println("있어")
        }
    }
    // 과일들 요소중에 사과가 있냐?
    if("사과" in 과일들) {
        println("사과 있음")
    }
    for(과일 in 과일들) {
        if(과일 == "사과") {
            println("사과있음")
            break
        }
    }

    // 과일들 요소중에 배는 없냐?
    if("배" !in 과일들) {
        println("배는 없어")
    }

}