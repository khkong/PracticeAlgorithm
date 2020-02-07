import org.junit.Before
import org.junit.Test

class Problem11Test {
    lateinit var solution: Problem11

    @Before
    fun setUp() {
        solution = Problem11()
    }

    @Test
    fun case1() {
        val result = solution.maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7))
        println(result)
        assert(result == 49)
    }

    @Test
    fun case2() {
        val result = solution.maxArea(intArrayOf(1, 1))
        println(result)
        assert(result == 1)
    }
}
