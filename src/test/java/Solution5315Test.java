import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class Solution5315Test {
    private Solution5315 solution;

    @Before
    public void setUp() {
        solution = new Solution5315();
    }

    @Test
    public void case1() {
        List<String> result = solution.printVertically("HOW ARE YOU");

        assert (result.size() == 3);
        assert (result.get(0).equals("HAY"));
        assert (result.get(1).equals("ORO"));
        assert (result.get(2).equals("WEU"));
    }

    @Test
    public void case2() {
        List<String> result = solution.printVertically("TO BE OR NOT TO BE");

        assert (result.size() == 3);
        assert (result.get(0).equals("TBONTB"));
        assert (result.get(1).equals("OEROOE"));
        assert (result.get(2).equals("   T"));
    }

    @Test
    public void case3() {
        List<String> result = solution.printVertically("CONTEST IS COMING");

        assert (result.size() == 7);
        assert (result.get(0).equals("CIC"));
        assert (result.get(1).equals("OSO"));
        assert (result.get(2).equals("N M"));
        assert (result.get(3).equals("T I"));
        assert (result.get(4).equals("E N"));
        assert (result.get(5).equals("S G"));
        assert (result.get(6).equals("T"));
    }

    @Test
    public void case4() {
    }

    @Test
    public void case5() {
    }

    @Test
    public void case6() {
    }
}
