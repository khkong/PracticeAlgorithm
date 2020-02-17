import java.util.LinkedHashMap;

public class Problem146 {

    class LRUCache {
        private LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        private int capacity;

        public LRUCache(int capacity) {
            this.capacity = capacity;
        }

        public int get(int key) {
            if (linkedHashMap.containsKey(key)) {
                int value = linkedHashMap.get(key);
                linkedHashMap.remove(key);
                linkedHashMap.put(key, value);
                return value;
            } else {
                return -1;
            }
        }

        public void put(int key, int value) {
            if (linkedHashMap.containsKey(key)) {
                linkedHashMap.remove(key);
                linkedHashMap.put(key, value);
                return;
            }
            if (linkedHashMap.size() == capacity) {
                int lastElement = linkedHashMap.keySet().iterator().next();
                if (linkedHashMap.containsKey(lastElement)) {
                    linkedHashMap.remove(lastElement);
                }
            }
            linkedHashMap.put(key, value);
        }
    }
}
