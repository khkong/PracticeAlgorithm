import org.junit.Before;
import org.junit.Test;

public class Solution5329Test {
    private Solution5329 solution;

    @Before
    public void setUp() {
        solution = new Solution5329();
    }

    @Test
    public void case1() {
        int[] arr = {3,3,3,3,5,5,5,2,2,7};
        int result = solution.minSetSize(arr);
        System.out.println(result);
        assert (result == 2);
    }

    @Test
    public void case2() {
        int[] arr = {9,77,63,22,92,9,14,54,8,38,18,19,38,68,58,19};
        int result = solution.minSetSize(arr);
        System.out.println(result);
        assert (result == 5);
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
