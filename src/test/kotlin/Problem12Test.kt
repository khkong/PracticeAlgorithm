import org.junit.Before
import org.junit.Test

class Problem12Test {
    lateinit var solution: Problem12

    @Before
    fun setUp() {
        solution = Problem12()
    }

    @Test
    fun case1() {
        val result = solution.intToRoman(3)
        assert(result == "III")
    }

    @Test
    fun case2() {
        val result = solution.intToRoman(4)
        assert(result == "IV")
    }

    @Test
    fun case3() {
        val result = solution.intToRoman(9)
        println(result)
        assert(result == "IX")
    }

    @Test
    fun case4() {
        val result = solution.intToRoman(58)
        println(result)
        assert(result == "LVIII")
    }

    @Test
    fun case5() {
        val result = solution.intToRoman(100)
        println(result)
        assert(result == "C")
    }
}
