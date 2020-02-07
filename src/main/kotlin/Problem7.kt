import java.lang.NumberFormatException

class Problem7 {
    fun reverse(x: Int): Int {
        return try {
            var reversedStr = x.toString().reversed()
            if (reversedStr[reversedStr.length - 1] == '-') {
                reversedStr = "-${reversedStr.substring(0, reversedStr.length - 1)}"
            }
            reversedStr.toInt()
        } catch (nfe: NumberFormatException) {
            0
        }
    }
}
