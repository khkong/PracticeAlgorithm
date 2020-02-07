public class Solution5316 {
    public int maximum69Number(int num) {
        String value = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        boolean isChange = false;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == '6' && !isChange) {
                sb.append('9');
                isChange = true;
            } else {
                sb.append(value.charAt(i));
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
