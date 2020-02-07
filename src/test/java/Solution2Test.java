import org.junit.Before;
import org.junit.Test;

public class Solution2Test {
    private Solution2 solution;

    @Before
    public void setUp() {
        solution = new Solution2();
    }

    @Test
    public void case1() {
        int result = solution.solution("SMS messages are really short", 12);
        System.out.println(result);
        assert (result == 3);
    }
    @Test
    public void case2() {
        int result = solution.solution("aaa ", 1);
        System.out.println(result);
        assert (result == 0);
    }
    @Test
    public void case3() {
        int result = solution.solution("aa aa aa aa aaa", 3);
        System.out.println(result);
        assert (result == 5);
    }

    @Test
    public void case4() {
        int result = solution.solution("", 3);
        System.out.println(result);
        assert (result == 0);
    }
    @Test
    public void case5() {
        int result = solution.solution(null, 3);
        System.out.println(result);
        assert (result == 0);
    }
}
