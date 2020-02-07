import org.junit.Before
import org.junit.Test

class Problem9Test {
    lateinit var solution: Problem9

    @Before
    fun setUp() {
        solution = Problem9()
    }

    @Test
    fun case1() {
        assert(solution.isPalindrome(121))
    }

    @Test
    fun case2() {
        assert(!solution.isPalindrome(-121))
    }

    @Test
    fun case3() {
        assert(!solution.isPalindrome(10))
    }
}
