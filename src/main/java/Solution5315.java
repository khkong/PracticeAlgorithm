import java.util.Arrays;
import java.util.List;

public class Solution5315 {
    public List<String> printVertically(String s) {
        String[] token = s.split(" ");

        int max = 0;
        for (int i = 0; i < token.length; i++) {
            if (token[i].length() > max)
                max = token[i].length();
        }

        String[] arr = new String[max];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "";
        }

        for (int i = 0; i < token.length; i++) {
            for (int j = 0; j < max; j++) {
                if (j < token[i].length()) {
                    arr[j] = arr[j] + token[i].charAt(j);
                } else {
                    arr[j] = arr[j] + " ";
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replaceAll("\\s+$", "");
        }
        return Arrays.asList(arr);
    }
}
