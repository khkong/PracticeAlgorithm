public class Solution5312 {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int answer = 0;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i - k >= 0) {
                sum -= arr[i - k];
            }
            if (i < k - 1)
                continue;

            if (threshold <= (float) sum / (float) k) {
                answer++;
            }
        }
        return answer;
    }
}
