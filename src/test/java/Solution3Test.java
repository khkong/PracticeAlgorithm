import org.junit.Before;
import org.junit.Test;

public class Solution3Test {
    private Solution3 solution;

    @Before
    public void setUp() {
        solution = new Solution3();
    }

    @Test
    public void case1() {
        int result = solution.solution("banana");
        System.out.println(result);
        assert (result == 3);
    }

    @Test
    public void case2() {
        int result = solution.solution("aa");
        System.out.println(result);
        assert (result == 0);
    }

    @Test
    public void case3() {
        int result = solution.solution(null);
        System.out.println(result);
        assert (result == 0);
    }

    @Test
    public void case4() {
        int result = solution.solution("bzayzw");
        System.out.println(result);
        assert (result == 3);
    }

    @Test
    public void case5() {
        int result = solution.solution("aabbcc");
        System.out.println(result);
        assert (result == 0);
    }

    @Test
    public void case6() {
        int result = solution.solution("aadbbdcc");
        System.out.println(result);
        assert (result == 2);
    }
}
