class Problem5308 {
    //
    fun minFlips(a: Int, b: Int, c: Int): Int {
        var result = 0
        var a2 = a
        var b2 = b
        var c2 = a2 + b2

        if (a == b && b == c)
            return 0
        if (c2 == 0 || c2 == c) return result

        val str1 = a.toUInt().toString(radix = 2)
        val str2 = b.toUInt().toString(radix = 2)
        val str3 = c.toUInt().toString(radix = 2)

        val min = Math.min(str3.length, Math.min(str1.length, str2.length))
        val max = Math.max(str3.length, Math.max(str1.length, str2.length))

        for (i in 0 until min) {

            if (str3.length < i + 1) {
                str1[i]
            } else if (str3[str3.length - (i + 1)] == '0') {

            } else if (str3[str3.length - (i + 1)] == '1') {

            }
        }

        return 0
    }

    private fun getBit(value: Int): Int {
        var value1 = value
        var count = 0
        while (value1 != 0) {
            value1 = value1.and(value1 - 1)
            count++
        }
        return count
    }
}
