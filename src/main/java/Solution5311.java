public class Solution5311 {
    public int numberOfSteps(int num) {
        return divide(num);
    }

    private int divide(int num) {
        System.out.println(num);
        if (num == 0)
            return 0;

        if (num % 2 == 0) {
            return 1 + divide(num / 2);
        } else {
            return 1 + divide(num - 1);
        }
    }
}
