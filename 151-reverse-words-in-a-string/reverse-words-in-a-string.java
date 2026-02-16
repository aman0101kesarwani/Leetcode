class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--;    // to skip outer spaces
            if (i < 0) break;

            int j = i;
            while (j >= 0 && s.charAt(j) != ' ') j--;

            result.append(s.substring(j + 1, i + 1));
            result.append(" ");

            i = j;
        }


        return result.toString().trim();
    }
}