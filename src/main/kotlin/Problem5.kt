class Problem5 {
    fun longestPalindrome(s: String): String {
        var result = ""
        val n = s.length
        var i = 0
        val dp = arrayOf(IntArray(n))
        while (i < n) {
            var j = i
            while (j < n) {
                val substr = s.substring(i, j + 1)
                if (result.length < substr.length) {
                    if (dp[i][j - 1] == 0) {
                        if (isPalindromic(substr)) {
                            dp[i][j] = 1
                            result = substr
                        } else {
                            dp[i][j] = -1
                        }
                    } else {
                        if (dp[i][j - 1] == 1 && s[i] == s[j]) {
                            dp[i][j] = 1
                            result = substr
                        }
                    }
                }
                j++
            }
            i++
        }
        return result
    }


    private fun isPalindromic(s: String): Boolean {
        val len = s.length - 1
        for (i in 0..len / 2) {
            if (s[i] != s[(len) - i])
                return false
        }
        return true
    }
}
