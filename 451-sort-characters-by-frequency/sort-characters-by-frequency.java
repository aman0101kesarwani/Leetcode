import java.util.*;

class Solution {
    public String frequencySort(String s) {
        
        // Step 1: Store frequency of each character
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // sort characters 
        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((a,b)->map.get(b)-map.get(a));

        // build result
        StringBuilder sb = new StringBuilder();
        for(char ch: list){
            int freq = map.get(ch);
            while(freq-->0){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}