class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for(int i=0; i<n; i++){
            if(i+m>n) break;

            String str = haystack.substring(i, i+m);
            if(needle.equals(str)){
                return i;
            }
        }
        return -1;
    }
}