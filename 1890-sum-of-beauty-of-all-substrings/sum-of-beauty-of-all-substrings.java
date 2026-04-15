class Solution { 
    public int beautySum(String s) {

        int ans = 0; // final answer

        // Fix starting index of substring
        for (int i = 0; i < s.length(); i++) {

            int[] f = new int[26]; // freq array for current window

            // Expand substring ending at j
            for (int j = i; j < s.length(); j++) {

                // include current character
                f[s.charAt(j) - 'a']++;

                int max = 0;
                int min = Integer.MAX_VALUE;

                // find max and min freq in current substring
                for (int k = 0; k < 26; k++) {
                    if (f[k] > 0) { // ignore zero freq
                        max = Math.max(f[k], max);
                        min = Math.min(f[k], min);
                    }
                }

                // beauty = max - min
                ans += (max - min);
            }
        }

        return ans;
    }
}