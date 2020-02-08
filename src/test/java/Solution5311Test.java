import org.junit.Before;
import org.junit.Test;

public class Solution5311Test {
    private Solution5311 solution;

    @Before
    public void setUp() {
        solution = new Solution5311();
    }

    @Test
    public void case1() {
        int result = solution.numberOfSteps(14);
        System.out.println(result);
        assert(result==6);
    }

    @Test
    public void case2() {
        int result = solution.numberOfSteps(8);
        System.out.println(result);
        assert(result==4);
    }

    @Test
    public void case3() {
    }

    @Test
    public void case4() {

    }

    @Test
    public void case5() {
    }
}
