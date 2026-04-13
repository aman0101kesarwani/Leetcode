class Solution {
    public String reverseWords(String s) {
        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();

        int i = 0;

        while (i < s.length()) {
            int j = i;

            // build word normally
            while (j < s.length() && s.charAt(j) != ' ') {
                word.append(s.charAt(j));
                j++;
            }

            // reverse once (O(k))
            result.append(word.reverse()).append(' ');

            // clear word
            word.setLength(0);

            i = j + 1;
        }

        return result.toString().trim();
    }
}