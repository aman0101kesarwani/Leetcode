import java.util.*;

class Solution {
    public String frequencySort(String s) {
        
        // Step 1: Frequency map
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Bucket array
        List<Character>[] bucket = new ArrayList[s.length() + 1];

        for (char ch : map.keySet()) {
            int freq = map.get(ch);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(ch);
        }

        // Step 3: Build result
        StringBuilder sb = new StringBuilder();

        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (char ch : bucket[i]) {
                    for (int j = 0; j < i; j++) {
                        sb.append(ch);
                    }
                }
            }
        }

        return sb.toString();
    }
}