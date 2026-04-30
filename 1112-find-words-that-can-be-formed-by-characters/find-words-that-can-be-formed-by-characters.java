class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charFreq = new int[26];

        // Count frequency of chars
        for (char c : chars.toCharArray()) {
            charFreq[c - 'a']++;
        }

        int result = 0;

        // Check each word
        for (String word : words) {
            int[] wordFreq = new int[26];
            boolean isGood = true;

            for (char c : word.toCharArray()) {
                wordFreq[c - 'a']++;

                if (wordFreq[c - 'a'] > charFreq[c - 'a']) {
                    isGood = false;
                    break;
                }
            }

            if (isGood) {
                result += word.length();
            }
        }

        return result;
    }
}