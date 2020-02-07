import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Solution5329 {

    class Structure implements Comparable {
        int count;
        int index;

        Structure(int index, int count) {
            this.count = count;
            this.index = index;
        }

        @Override
        public int compareTo(Object o) {
            if (((Structure) o).count == this.count)
                return 0;
            else if (((Structure) o).count > this.count)
                return 1;
            else
                return -1;
        }
    }

    public int minSetSize(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Structure> list = new ArrayList<>();
        int prevKey = 0;
        int prevCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (prevKey != arr[i]) {
                if (prevKey != 0) {
                    list.add(new Structure(prevKey, prevCount));
                }
                prevCount = 0;
                prevKey = arr[i];
            }
            prevCount++;
        }
        if (prevKey != 0) {
            list.add(new Structure(prevKey, prevCount));
        }
        Collections.sort(list);


        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).count;
            if (sum >= arr.length / 2) {
                return i + 1;
            }
        }
        return 1;
    }
}
