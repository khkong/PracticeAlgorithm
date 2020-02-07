import java.lang.NumberFormatException
import java.lang.StringBuilder

class Problem8 {
    fun myAtoi(str: String): Int {
        if (str.isEmpty() || str == "-" || str == "+")
            return 0

        val builder = StringBuilder()
        var isMinus = false

        try {
            str.forEachIndexed { index, char ->
                if (builder.isEmpty() && char == ' ') {

                } else if (builder.isEmpty() && char == '-') {
                    builder.append(char)
                    isMinus = true
                } else if (builder.isEmpty() && char == '+') {
                    builder.append(char)
                    isMinus = false
                } else if (char in '0'..'9') {
                    builder.append(char)
                } else {
                    if (builder.isEmpty() || builder.toString() == "-" || builder.toString() == "+")
                        return 0
                    return builder.toString().toInt()
                }
            }
            if (builder.isEmpty() || builder.toString() == "-" || builder.toString() == "+")
                return 0
            return builder.toString().toInt()
        } catch (nfe: NumberFormatException) {
            if (isMinus)
                return Int.MIN_VALUE
            else
                return Int.MAX_VALUE
        }
    }
}
