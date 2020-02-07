import org.junit.Before
import org.junit.Test

class Problem13Test {
    lateinit var solution: Problem13

    @Before
    fun setUp() {
        solution = Problem13()
    }

    @Test
    fun case1() {
        val result = solution.romanToInt("III")
        println(result)
        assert(result == 3)
    }

    @Test
    fun case2() {
        val result = solution.romanToInt("IV")
        println(result)
        assert(result == 4)
    }

    @Test
    fun case3() {
        val result = solution.romanToInt("IX")
        println(result)
        assert(result == 9)
    }

    @Test
    fun case4() {
        val result = solution.romanToInt("LVIII")
        println(result)
        assert(result == 58)
    }

    @Test
    fun case5() {
        val result = solution.romanToInt("C")
        println(result)
        assert(result == 100)
    }

    @Test
    fun case6() {
        val result = solution.romanToInt("MCMXCIV")
        println(result)
        assert(result == 1994)
    }
}
