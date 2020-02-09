import org.junit.Before;
import org.junit.Test;

public class Solution6001Test {
    private Solution6001 solution;

    @Before
    public void setUp() {
        solution = new Solution6001();
    }

    @Test
    public void case1() {
        int result = solution.minSteps("bab", "aba");
        System.out.println(result);
        assert (result == 1);
    }

    @Test
    public void case2() {
        int result = solution.minSteps("leetcode", "practice");
        System.out.println(result);
        assert (result == 5);
    }

    @Test
    public void case3() {
        int result = solution.minSteps("anagram", "mangaar");
        System.out.println(result);
        assert (result == 0);
    }

    @Test
    public void case4() {
        int result = solution.minSteps("xxyyzz", "xxyyzz");
        System.out.println(result);
        assert (result == 0);
    }

    @Test
    public void case5() {
        int result = solution.minSteps("friend", "family");
        System.out.println(result);
        assert (result == 4);
    }
}
