class Solution {
    public int beautySum(String s) {

        int n = s.length();
        int total = 0;

        // Fix starting point
        for (int i = 0; i < n; i++) {

            int[] freq = new int[26]; // only lowercase letters

            // Expand substring
            for (int j = i; j < n; j++) {

                // include character
                freq[s.charAt(j) - 'a']++;

                int max = 0;
                int min = Integer.MAX_VALUE;

                // calculate max and min freq
                for (int f : freq) {
                    if (f > 0) {
                        max = Math.max(max, f);
                        min = Math.min(min, f);
                    }
                }

                total += (max - min);
            }
        }

        return total;
    }
}