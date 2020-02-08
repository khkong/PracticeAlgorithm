import org.junit.Before;
import org.junit.Test;

public class Solution5313Test {
    private Solution5313 solution;

    @Before
    public void setUp() {
        solution = new Solution5313();
    }

    @Test
    public void case1() {
        double result = solution.angleClock(12, 30);
        System.out.println(result);
        assert (result == 165);
    }

    @Test
    public void case2() {
        double result = solution.angleClock(3, 30);
        System.out.println(result);
        assert (result == 75);
    }

    @Test
    public void case3() {
        double result = solution.angleClock(3, 15);
        System.out.println(result);
        assert (result == 7.5);
    }

    @Test
    public void case4() {
        double result = solution.angleClock(4, 50);
        System.out.println(result);
        assert (result == 155);
    }

    @Test
    public void case5() {
        double result = solution.angleClock(12, 0);
        System.out.println(result);
        assert (result == 0);
    }

    @Test
    public void case6() {
        double result = solution.angleClock(1, 57);
        System.out.println(result);
        assert (result == 76.5);
    }
}
