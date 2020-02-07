import org.junit.Before;
import org.junit.Test;

public class Solution5318Test {
    private Solution5318 solution;

    @Before
    public void setUp() {
        solution = new Solution5318();
    }

    @Test
    public void case1() {
        int[] ranges = {3, 4, 1, 1, 0, 0};
        int result = solution.minTaps(5, ranges);
        System.out.println(result);
        assert (result == 1);
    }

    @Test
    public void case2() {
        int[] ranges = {0, 0, 0, 0};
        int result = solution.minTaps(3, ranges);
        System.out.println(result);
        assert (result == -1);
    }

    @Test
    public void case3() {
        int[] ranges = {1,2,1,0,2,1,0,1};
        int result = solution.minTaps(7, ranges);
        System.out.println(result);
        assert (result == 3);
    }

    @Test
    public void case4() {
        int[] ranges = {4,0,0,0,0,0,0,0,4};
        int result = solution.minTaps(8, ranges);
        System.out.println(result);
        assert (result == 2);
    }

    @Test
    public void case5() {
        int[] ranges = {4,0,0,0,4,0,0,0,4};
        int result = solution.minTaps(8, ranges);
        System.out.println(result);
        assert (result == 1);
    }
}
