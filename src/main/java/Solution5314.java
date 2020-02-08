import java.util.ArrayList;
import java.util.Arrays;

public class Solution5314 {

    class A {
        int value;
        int index;
        A prev = null;
        A next = null;
        ArrayList<A> sameValue = new ArrayList<>();
    }

    public int minJumps(int[] arr) {
        A[] a = new A[arr.length];
        A init = null;
        for (int i = 0; i < arr.length; i++) {
            a[i] = new A();
            a[i].index = i;
            a[i].value = arr[i];
            if (i > 0)
                a[i].prev = a[i - 1];
            if (i < arr.length - 1)
                a[i].next = a[i + 1];
            if (init == null)
                init = a[i];
        }
        Arrays.sort(a);

        for (int i = 0; i < a.length - 1; i++) {
            a[i].sameValue.add(a[i]);
            if (a[i].value == a[i + 1].value) {
                a[i + 1].sameValue = a[i].sameValue;
            }
        }
//        dfs(init, arr.length, 0);
        return 0;
    }
//
//    private int dfs(A root, int target, int jump) {
//        if (root.index == target) {
//            return jump;
//        }
//    }
}
