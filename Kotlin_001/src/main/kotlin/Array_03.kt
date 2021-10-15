fun main() {

    val array = arrayListOf<Int>()


    val primes = array.filter {
        {
            // it 이 소수인가 ? 판별하는 코드
            // 소수가 맞다 return true
            for (num in 2 until it) {
                if (num % it == 0) return false
            }
            return true
        }
    }



    }


}