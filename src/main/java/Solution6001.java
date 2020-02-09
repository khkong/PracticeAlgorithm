import java.util.HashMap;

public class Solution6001 {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        int answer = 0;
        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                int value = map.get(t.charAt(i));
                if (value == 0) {
                    answer++;
                } else {
                    map.put(t.charAt(i), value - 1);
                }
            } else {
                answer++;
            }
        }
        return answer;
    }
}
