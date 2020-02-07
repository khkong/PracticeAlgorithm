import org.junit.Before
import org.junit.Test

class Problem5309Test {
    lateinit var solution: Problem5309

    @Before
    fun setUp() {
        solution = Problem5309()
    }

    @Test
    fun case1() {
        val result = solution.makeConnected(
            6, arrayOf(
                intArrayOf(0, 1),
                intArrayOf(0, 2),
                intArrayOf(0, 3),
                intArrayOf(1, 2),
                intArrayOf(1, 3)
            )
        )
        println(result)
        assert(result == 2)
    }

    @Test
    fun case2() {
        val result = solution.makeConnected(
            6, arrayOf(
                intArrayOf(0, 1),
                intArrayOf(0, 2),
                intArrayOf(0, 3),
                intArrayOf(1, 2)
            )
        )
        println(result)
        assert(result == -1)
    }

    @Test
    fun case3() {
        val result = solution.makeConnected(
            5, arrayOf(
                intArrayOf(0, 1),
                intArrayOf(0, 2),
                intArrayOf(3, 4),
                intArrayOf(2, 3)
            )
        )
        println(result)
        assert(result == 0)
    }

}
