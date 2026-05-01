class Solution {
    public List<String> commonChars(String[] words) {

        int[] base = new int[26];

        // Step 1: fill base with first word
        for (char c : words[0].toCharArray()) {
            base[c - 'a']++;
        }

        // Step 2: process remaining words
        for (int i = 1; i < words.length; i++) {

            int[] curr = new int[26];

            for (char c : words[i].toCharArray()) {
                curr[c - 'a']++;
            }

            // take minimum
            for (int j = 0; j < 26; j++) {
                base[j] = Math.min(base[j], curr[j]);
            }
        }

        // Step 3: build result
        List<String> result = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            while (base[i]-- > 0) {
                result.add(String.valueOf((char)(i + 'a')));
            }
        }

        return result;
    }
}