class Solution {
    public String convertToTitle(int columnNumber) {
        //  AB
        // 28 - 1 = 27  :  In normal base-26 , Digits range → 0 to 25, but in excel range: 1-26 
        // 27 % 26 = 1 → B
        // 27 / 26 = 1

        // Step 2:
        // 1 - 1 = 0
        // 0 % 26 = 0 → A
        // "BA" → reverse → "AB"


        StringBuilder sb = new StringBuilder();

        while(columnNumber>0){
            columnNumber--;

            int rem = columnNumber%26;
            char ch = (char) ('A' + rem);   //doing numeric addition: 65+rem

            sb.append(ch);
            columnNumber = columnNumber/26;
        }

        return sb.reverse().toString();

    }
}