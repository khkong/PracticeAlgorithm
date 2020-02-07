public class Solution2 {
    public int solution(String S, int K) {
        // time complexity O(n)
        // 자바 버전에 따라, length() == 0 일 때, split 할 경우 null 을 반활 할 수도 있지 않을까?
        if (S == null || S.length() == 0)
            return 0;

        int result = 0;

        int sentence = 0;
        String[] tokens = S.split(" ");
        for (int i = 0; i < tokens.length; i++) { // <== tokens.length 여기서 NPE 발생 의심
            if (tokens[i].length() > K)
                return 0;

            if (sentence + tokens[i].length() < K) {
                if (sentence > 0)
                    sentence += 1;//띄어쓰기
                sentence = sentence + tokens[i].length();
            } else {
                result++;
                sentence = tokens[i].length();
            }
        }
        if (sentence > 0)
            result++;

        return result;
    }
//    public int solution(String S, int K) {
//        if (S == null || S.length() == 0)
//            return 0;
//
//        int result = 0;
//
//        int tmp = 0;
//        String[] tokens = S.split(" ");
//        for (int i = 0; i < tokens.length; i++) {
//            if (tokens[i].length() > K)
//                return 0;
//
//            if (tmp + tokens[i].length() < K) {
//                if (tmp > 0)
//                    tmp += 1;//띄어쓰기
//                tmp = tmp + tokens[i].length();
//            } else {
//                result++;
//                tmp = tokens[i].length();
//            }
//        }
//        if (tmp > 0)
//            result++;
//
//        return result;
//    }
}
