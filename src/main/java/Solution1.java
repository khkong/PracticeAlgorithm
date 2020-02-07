public class Solution1 {
    public int solution(int[][] A) {
        if (A == null)
            return 0;
        // 아래 코드는 불필요 했음
        //        if (A.length == 0)
        //            return 0;
        //        if (A.length == 1 && A[0].length == 1)
        //            return 0;
        // time complexity = O(n)
        // 2차원 배열이 param 으로 들어왔고, 각 값들을 한 바퀴 순회했기 때문
        int result = 0;
        for (int i = 1; i < A.length - 1; i++) {
//            if (A[i] == null) // 문제 기억이 잘안나는데.. 이 코드를 넣어줬어야 했나..
//                return 0;

            for (int j = 1; j < A[i].length - 1; j++) {
                int top = A[i - 1][j];
                int bottom = A[i + 1][j];
                int left = A[i][j - 1];
                int right = A[i][j + 1];
                int center = A[i][j];
                if (isSaddlePoint(top, bottom, left, right, center)) {
                    result++;
                }
            }
        }
        return result;
    }

    private boolean isSaddlePoint(int top, int bottom, int left, int right, int center) {
        return (isLocalMaximum(top, center, bottom) && isLocalMinimum(left, center, right)) ||
                (isLocalMinimum(top, center, bottom) && isLocalMaximum(left, center, right));
    }

    private boolean isLocalMaximum(int prev, int curr, int next) {
        return curr > prev && curr > next;
    }

    private boolean isLocalMinimum(int prev, int curr, int next) {
        return curr < prev && curr < next;
    }

//    public int solution(int[][] A) {
//        if (A == null)
//            return 0;
//        if (A.length == 0)
//            return 0;
//        if (A.length == 1 && A[0].length == 1)
//            return 0;
//
//        // time complexity = O(n)
//        // 2차원 배열이 param 으로 들어왔고, 각 값들을 한 바퀴 순회했기 때문
//        int result = 0;
//        for (int i = 1; i < A.length - 1; i++) {
//            for (int j = 1; j < A[i].length - 1; j++) {
//                if (isLocalMaximum(A[i][j - 1], A[i][j], A[i][j + 1])) {
//                    if (isLocalMinimum(A[i - 1][j], A[i][j], A[i + 1][j])) {
//                        result++;
//                    }
//                }
//                if (isLocalMinimum(A[i][j - 1], A[i][j], A[i][j + 1])) {
//                    if (isLocalMaximum(A[i - 1][j], A[i][j], A[i + 1][j])) {
//                        result++;
//                    }
//                }
//            }
//        }
//        return result;
//    }
//
//    private boolean isLocalMaximum(int prev, int curr, int next) {
//        return curr > prev && curr > next;
//    }
//
//    private boolean isLocalMinimum(int prev, int curr, int next) {
//        return curr < prev && curr < next;
//    }
}
