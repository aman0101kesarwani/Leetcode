class Solution {
    public boolean isAnagram(String s, String t) {
        //m1: using freq array  (better)
        //m2: using HashMap

        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count s
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Subtract t
        for (char c : t.toCharArray()) {   // ✅ FIXED
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        // Step 3: Check all zero
        for (int val : map.values()) {
            if (val != 0) return false;   // ✅ FIXED
        }

        return true;
    }
}