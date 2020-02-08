import org.junit.Before;
import org.junit.Test;

public class Solution5314Test {
    private Solution5314 solution;

    @Before
    public void setUp() {
        solution = new Solution5314();
    }

    @Test
    public void case1() {
        int[] arr = {100, -23, -23, 404, 100, 23, 23, 23, 3, 404};
        int result = solution.minJumps(arr);
        System.out.println(result);
        assert (result == 3);
    }

    @Test
    public void case2() {
        int[] arr = {7};
        int result = solution.minJumps(arr);
        System.out.println(result);
        assert (result == 0);
    }

    @Test
    public void case3() {
        int[] arr = {7, 6, 9, 6, 9, 6, 9, 7};
        int result = solution.minJumps(arr);
        System.out.println(result);
        assert (result == 1);
    }

    @Test
    public void case4() {
        int[] arr = {6, 1, 9};
        int result = solution.minJumps(arr);
        System.out.println(result);
        assert (result == 2);
    }

    @Test
    public void case5() {
        int[] arr = {11, 22, 7, 7, 7, 7, 7, 7, 7, 22, 13};
        int result = solution.minJumps(arr);
        System.out.println(result);
        assert (result == 3);
    }
}
