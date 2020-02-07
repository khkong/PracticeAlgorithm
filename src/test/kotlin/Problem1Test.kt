import org.junit.Before
import org.junit.Test

class Problem1Test {
    lateinit var solution: Problem1

    @Before
    fun setUp() {
        solution = Problem1()
    }

    @Test
    fun case1() {
        val result = solution.twoSum(intArrayOf(2, 7, 11, 15), 9)
        assert(result[0] == 0)
        assert(result[1] == 1)
    }

    @Test
    fun case2() {
        val result = solution.twoSum(intArrayOf(3, 2, 4), 6)
        assert(result[0] == 1)
        assert(result[1] == 2)
    }
}
