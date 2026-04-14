class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        int i = 0;

        while (i < n) {
            int start = i;

            // find end of word
            while (i < n && arr[i] != ' ') {
                i++;
            }

            // reverse current word
            int l = start;
            int r = i-1;
            while (l < r) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }

            i++; // skip space
        }

        return new String(arr);
    }
}