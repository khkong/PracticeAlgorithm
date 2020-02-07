import org.junit.Before
import org.junit.Test

class Problem5307Test {
    lateinit var solution: Problem5307

    @Before
    fun setUp() {
        solution = Problem5307()
    }

    @Test
    fun case1() {
        val result = solution.getNoZeroIntegers(2)
        assert(result[0] == 1)
        assert(result[1] == 1)
    }

    @Test
    fun case2() {
        val result = solution.getNoZeroIntegers(11)
        println(result[0])
        assert(result[0] == 2)
        assert(result[1] == 9)
    }

    @Test
    fun case3() {
        val result = solution.getNoZeroIntegers(10000)
        println(result.toString())
        assert(result[0] == 1)
        assert(result[1] == 9999)
    }

    @Test
    fun case4() {
        val result = solution.getNoZeroIntegers(1010)
        println(result.toString())
        assert(result[0] == 11)
        assert(result[1] == 999)
    }
}
