import org.junit.Before;
import org.junit.Test;

public class Solution6003Test {
    private Solution6003 solution;

    @Before
    public void setUp() {
        solution = new Solution6003();
    }

    @Test
    public void case1() {
        char[][] arr = {
                {'#', '.', '#', '#', '.', '#'},
                {'.', '#', '#', '#', '#', '.'},
                {'#', '.', '#', '#', '.', '#'}
        };
        int result = solution.maxStudents(arr);
        System.out.println(result);
        assert (result == 4);
    }

    @Test
    public void case2() {
        char[][] arr = {
                {'.', '#'},
                {'#', '#'},
                {'#', '.'},
                {'#', '#'},
                {'.', '#'}
        };
        int result = solution.maxStudents(arr);
        System.out.println(result);
        assert (result == 3);
    }

    @Test
    public void case3() {
        char[][] arr = {
                {'#','.','.','.','#'},
                {'.','#','.','#','.'},
                {'.','.','#','.','.'},
                {'.','#','.','#','.'},
                {'#','.','.','.','#'}
        };
        int result = solution.maxStudents(arr);
        System.out.println(result);
        assert (result == 10);
    }

    @Test
    public void case4() {

    }

    @Test
    public void case5() {
    }
}
