class Problem5307 {
    fun getNoZeroIntegers(n: Int): IntArray {
        var a = 0
        var b = 0

        for (i in 1 until n) {
            a = i
            b = n - i

            if (!a.toString().contains("0") && !b.toString().contains("0")) {
                return intArrayOf(a, b)
            }
        }
        return intArrayOf(0, 0)
    }
}
