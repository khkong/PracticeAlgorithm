class Problem3 {
    fun lengthOfLongestSubstring(s: String): Int {
        var result = 0
        var i = 0
        var j = 0
        val length = s.length
        val set = hashSetOf<Char>()
        while (i < length && j < length) {
            if (set.contains(s[j])) {
                set.remove(s[i++])
            } else {
                set.add(s[j++])
                result = Math.max(result, j - i)
            }
            println()
        }
        return result
    }
}