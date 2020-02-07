import org.junit.Before
import org.junit.Test

class Problem5143Test {
    lateinit var solution: Problem5143

    @Before
    fun setUp() {
        solution = Problem5143()
    }

    @Test
    fun case1() {
        val result = solution.decompressRLElist(intArrayOf(1, 2, 3, 4))
        assert(result[0] == 2)
        assert(result[1] == 4)
        assert(result[2] == 4)
        assert(result[3] == 4)
    }

    @Test
    fun case2() {
    }
}
