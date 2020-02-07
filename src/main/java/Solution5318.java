public class Solution5318 {

    public int minTaps(int n, int[] ranges) {
        int bestDepth = Integer.MAX_VALUE;
        for (int i = 0; i < ranges.length; i++) {

            boolean[] garden = new boolean[n + 1];
            for (int j = 0; j < garden.length; j++) {
                if (i - ranges[i] <= j && i + ranges[i] >= j) {
                    garden[j] = true;
                }
            }
            int result = recursion(n, ranges, i + 1, garden, 1);
            if (result < bestDepth) {
                bestDepth = result;
            }
        }

        if (ranges.length == bestDepth)
            return -1;

        return bestDepth;
    }

    private int recursion(int n, int[] ranges, int position, boolean[] garden, int depth) {
        if (isFull(garden))
            return depth;

        int bestDepth = Integer.MAX_VALUE;
        for (int i = position; i < ranges.length; i++) {

            boolean[] gardenCopy = new boolean[n + 1];
            System.arraycopy(garden, 0, gardenCopy, 0, gardenCopy.length);
            for (int j = 0; j < gardenCopy.length; j++) {
                if (i - ranges[i] <= j && i + ranges[i] >= j) {
                    gardenCopy[j] = true;
                }
            }

            int result = recursion(n, ranges, i + 1, gardenCopy, depth + 1);
            if (result < bestDepth) {
                bestDepth = result;
            }
        }
        return bestDepth;
    }

    private boolean isFull(boolean[] garden) {
        for (boolean b : garden) {
            if (!b)
                return false;
        }
        return true;
    }
}
