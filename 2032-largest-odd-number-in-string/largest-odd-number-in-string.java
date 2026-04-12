class Solution {
    public String largestOddNumber(String num) {
        //  " 4  2  0  6 "
        //             i
        //          i
        //       i
        //    i    

        for(int i = num.length() - 1; i >= 0; i--){
            if((num.charAt(i) - '0') % 2 == 1){
                return num.substring(0, i + 1);    // as we to return the largest substring
            }
        }

        return "";
    }
}
