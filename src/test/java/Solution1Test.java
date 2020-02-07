import org.junit.Before;
import org.junit.Test;

public class Solution1Test {
    private Solution1 solution;

    @Before
    public void setUp() {
        solution = new Solution1();
    }

    @Test
    public void case1() {
        int[][] A = {
                {0, 1, 9, 3},
                {7, 5, 8, 3},
                {9, 2, 9, 4},
                {4, 6, 7, 1}
        };
        int result = solution.solution(A);
        System.out.println(result);
        assert (result == 2);
    }


    @Test
    public void case2() {
        int[][] A = {
                {0, 1, 2, 3},
                {11, 12, 13, 4},
                {10, 15, 14, 5},
                {9, 8, 7, 6}
        };
        int result = solution.solution(A);
        System.out.println(result);
        assert (result == 0);
    }
    @Test
    public void case3() {
        int[][] A = {
                {1},
        };
        int result = solution.solution(A);
        System.out.println(result);
        assert (result == 0);
    }
    @Test
    public void case4() {
        int[][] A = {
        };
        int result = solution.solution(A);
        System.out.println(result);
        assert (result == 0);
    }
}
