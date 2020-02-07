import org.junit.Before;
import org.junit.Test;

public class Solution5328Test {
    private Solution5328 solution;

    @Before
    public void setUp() {
        solution = new Solution5328();
    }

    @Test
    public void case1() {
        int[][] mat = {
                {1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1},
        };
        int[] result = solution.kWeakestRows(mat, 3);


        assert(result[0]==2);
        assert(result[1]==0);
        assert(result[2]==3);
    }

    @Test
    public void case2() {

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
