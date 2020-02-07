import org.junit.Before
import org.junit.Test

class Problem6Test {
    lateinit var solution: Problem6

    @Before
    fun setUp() {
        solution = Problem6()
    }

    @Test
    fun case1() {
        val result = solution.convert("PAYPALISHIRING", 3)
        assert(result == "PAHNAPLSIIGYIR")
    }

    @Test
    fun case2() {
        val result = solution.convert("PAYPALISHIRING", 4)
        assert(result == "PINALSIGYAHRPI")
    }
}
