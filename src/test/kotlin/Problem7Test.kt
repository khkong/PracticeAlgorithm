import org.junit.Before
import org.junit.Test

class Problem7Test {
    lateinit var solution: Problem7

    @Before
    fun setUp() {
        solution = Problem7()
    }

    @Test
    fun case1() {
        assert(solution.reverse(123) == 321)
    }

    @Test
    fun case2() {
        assert(solution.reverse(-123) == -321)
    }

    @Test
    fun case3() {
        assert(solution.reverse(120) == 21)
    }

    @Test
    fun case4(){
//        assert(solution.reverse(9646324351) == 9646324351)
    }
}
