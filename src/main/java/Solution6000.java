
public class Solution6000 {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (i == j)
                    continue;
                if (value * 2 == arr[j]) {
                    return true;
                }
//                if (value * 2 < arr[j])
//                    break;
            }
        }
        return false;
    }
}
