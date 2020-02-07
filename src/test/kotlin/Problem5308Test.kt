import org.junit.Before
import org.junit.Test

class Problem5308Test {
    lateinit var solution: Problem5308

    @Before
    fun setUp() {
        solution = Problem5308()
    }

    @Test
    fun case1() {
        val result = solution.minFlips(2, 6, 5)
        println(result)
        assert(result == 3)
    }

    @Test
    fun case2() {
        val result = solution.minFlips(4, 2, 7)
        println(result)
        assert(result == 1)
    }

    @Test
    fun case3() {
        val result = solution.minFlips(1, 2, 3)
        println(result)
        assert(result == 0)
    }
    @Test
    fun case4() {
        val result = solution.minFlips(7, 7, 7)
        println(result)
        assert(result == 0)
    }
    @Test
    fun case5() {
        val result = solution.minFlips(5, 2, 8)
        println(result)
        assert(result == 4)
    }
    @Test
    fun case6() {
        val result = solution.minFlips(10,9 ,1)
        println(result)
        assert(result == 3)
    }
}
