import java.lang.StringBuilder

class Problem12 {
    //    I             1
    //    V             5
    //    X             10
    //    L             50
    //    C             100
    //    D             500
    //    M             1000
    fun intToRoman(num: Int): String {
        val unit = listOf("I", "V", "X", "L", "C", "D", "M")
        var result = ""

        var tmp = num
        var unitIndex = 0
        while (tmp != 0) {
            val value = tmp % 10
            var answer = ""
            when (value) {
                0 -> {
//                    if (unitIndex != 0)
//                        answer += unit[unitIndex - 1]
                }
                1 -> answer += unit[unitIndex]
                2 -> {
                    answer += unit[unitIndex]
                    answer += unit[unitIndex]
                }
                3 -> {
                    answer += unit[unitIndex]
                    answer += unit[unitIndex]
                    answer += unit[unitIndex]
                }
                4 -> {
                    answer += unit[unitIndex]
                    answer += unit[unitIndex + 1]
                }
                5 -> {
                    answer += unit[unitIndex + 1]
                }
                6 -> {
                    answer += unit[unitIndex + 1]
                    answer += unit[unitIndex]
                }
                7 -> {
                    answer += unit[unitIndex + 1]
                    answer += unit[unitIndex]
                    answer += unit[unitIndex]
                }
                8 -> {
                    answer += unit[unitIndex + 1]
                    answer += unit[unitIndex]
                    answer += unit[unitIndex]
                    answer += unit[unitIndex]
                }
                9 -> {
                    answer += unit[unitIndex]
                    answer += unit[unitIndex + 2]
                }
            }
            tmp /= 10
            unitIndex += 2
            result = answer + result
        }
        return result
    }
}
