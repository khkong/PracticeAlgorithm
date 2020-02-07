import java.lang.StringBuilder

class Problem6 {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1)
            return s

        val row = arrayListOf<StringBuilder>()
        for (i in 0 until Math.min(s.length, numRows))
            row.add(StringBuilder())

        var currRow = 0
        var goingDown = false
        s.forEach {
            row[currRow].append(it)

            if(currRow == 0)
                goingDown = true
            if(currRow == numRows -1)
                goingDown = false

            if (goingDown)
                currRow += 1
            else
                currRow -= 1
        }

        var result = ""
        for (item in row) {
            result += item.toString()
        }
        return result
    }
}
