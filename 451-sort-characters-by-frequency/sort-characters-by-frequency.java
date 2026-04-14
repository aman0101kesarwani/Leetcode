class Solution {
    public String frequencySort(String s) {
        // m1 : HashMap and PriorityQueue
        // m2 : HashMap and bucket array 

        // step 1: count freq using map
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch , map.getOrDefault(ch,0)+1);
        }

        // Step 2: Create Max Heap based on frequency
        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );
        // add all char to heap
        pq.addAll(map.keySet());
        

        // Step 3: Build result string
        StringBuilder sb = new StringBuilder();

        while (!pq.isEmpty()) {
            char ch = pq.poll();
            int freq = map.get(ch);

            for (int i = 0; i < freq; i++) {
                sb.append(ch);
            }
        }

        return sb.toString();

    }
}