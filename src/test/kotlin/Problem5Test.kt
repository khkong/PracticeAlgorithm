import org.junit.Before
import org.junit.Test

class Problem5Test {
    lateinit var solution: Problem5

    @Before
    fun setUp() {
        solution = Problem5()
    }

    @Test
    fun case1() {
        val result = solution.longestPalindrome("babaad")
        assert(result == "bab")
    }

    @Test
    fun case2() {
        val result = solution.longestPalindrome("cbbd")
        assert(result == "bb")
    }
}
