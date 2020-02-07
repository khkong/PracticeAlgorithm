import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Solution5328 {

    class Structure implements Comparable {
        int count;
        int index;

        Structure(int index, int count) {
            this.count = count;
            this.index = index;
        }

        @Override
        public int compareTo(@NotNull Object o) {
            if (((Structure) o).count == this.count)
                return 0;
            else if (((Structure) o).count < this.count)
                return 1;
            else
                return -1;
        }
    }

    public int[] kWeakestRows(int[][] mat, int k) {


        ArrayList<Structure> array = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {

            int soldierCount = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    soldierCount++;
                }
            }
            array.add(new Structure(i, soldierCount));
        }

        Collections.sort(array);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = array.get(i).index;
        }
        return result;
    }
}
