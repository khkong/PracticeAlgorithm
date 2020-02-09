import org.junit.Before;
import org.junit.Test;

public class Solution6000Test {
    private Solution6000 solution;

    @Before
    public void setUp() {
        solution = new Solution6000();
    }

    @Test
    public void case1() {
        int[] arr = {10,2,5,3};
        boolean result = solution.checkIfExist(arr);
        System.out.println(result);
        assert (result);
    }

    @Test
    public void case2() {
        int[] arr = {7,1,14,11};
        boolean result = solution.checkIfExist(arr);
        System.out.println(result);
        assert (result);
    }

    @Test
    public void case3() {
        int[] arr = {3,1,7,11};
        boolean result = solution.checkIfExist(arr);
        System.out.println(result);
        assert (!result);
    }

    @Test
    public void case4() {
        int[] arr = {-10,12,-20,-8,15};
        boolean result = solution.checkIfExist(arr);
        System.out.println(result);
        assert (result);
    }

    @Test
    public void case5() {
    }
}
