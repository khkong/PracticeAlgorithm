import org.junit.Before
import org.junit.Test

class Problem5144Test {
    lateinit var solution: Problem5144

    @Before
    fun setUp() {
        solution = Problem5144()
    }

    @Test
    fun case1() {
        val result = solution.matrixBlockSum(
            arrayOf(
                intArrayOf(1,2,3),
                intArrayOf(4,5,6),
                intArrayOf(7,8,9)
            ),
            1
        )

    }

    @Test
    fun case2() {
    }
}
