public class Solution3 {
    public int solution(String S) {
        if (S == null || S.length() == 0) { // length() 체크의 큰 의미는 없다.
            return 0;
        }
        int[] dp = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            int result = 1;
            for (int j = 0; j < i; j++) {
                if (S.charAt(j) <= S.charAt(i)) {
                    if (result < dp[j] + 1) {
                        result = dp[j] + 1;
                    }
                }
            }
            dp[i] = result;
        }

        int best = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            if (best < dp[i]) {
                best = dp[i];
            }
        }
        return S.length() - best;
    }
}
