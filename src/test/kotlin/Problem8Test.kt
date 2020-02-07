import org.junit.Before
import org.junit.Test

class Problem8Test {
    lateinit var solution: Problem8

    @Before
    fun setUp() {
        solution = Problem8()
    }

    @Test
    fun case1() {
        assert(solution.myAtoi("42") == 42)
    }

    @Test
    fun case2() {
        assert(solution.myAtoi("       -42") == -42)
    }

    @Test
    fun case3() {
        assert(solution.myAtoi("words and 987") == 0)
    }

    @Test
    fun case4() {
        assert(solution.myAtoi("-91283472332") == -2147483648)
    }
}
