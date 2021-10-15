fun main() {

    for(num in 1..5) {
        println("* ".repeat(num))
    }

    for(num in 1..5) {
        for(s in 1..num ) {
            print("* ")
        }
        println()
    }

    for(num in 1..5) {
        for(num1 in 5 downTo num) {
            print("* ")
        }
        println()
    }
}