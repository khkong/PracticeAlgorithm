import org.junit.Before
import org.junit.Test

class Problem3Test {
    lateinit var solution: Problem3

    @Before
    fun setUp() {
        solution = Problem3()
    }

    @Test
    fun case1() {
        val result = solution.lengthOfLongestSubstring("abcabcbb")
        assert(result == 3)
    }

    @Test
    fun case2() {
        val result = solution.lengthOfLongestSubstring("bbbbb")
        assert(result == 1)
    }

    @Test
    fun case3() {
        val result = solution.lengthOfLongestSubstring("pwwkew")
        assert(result == 3)
    }

    @Test
    fun case4() {
        val result = solution.lengthOfLongestSubstring("dvdf")
        assert(result == 3)
    }

    @Test
    fun case5() {
        val result = solution.lengthOfLongestSubstring("dvashdfvashqwer")
        assert(result == 10)
    }
}