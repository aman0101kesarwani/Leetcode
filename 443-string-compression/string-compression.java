class Solution {
    public int compress(char[] chars) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length; ) {

            char current = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }

            sb.append(current);

            if (count > 1) {
                sb.append(count);
            }
        }

        char[] ans = sb.toString().toCharArray();

        for (int i = 0; i < ans.length; i++) {
            chars[i] = ans[i];
        }

        return ans.length;
    }
}