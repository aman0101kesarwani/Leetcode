class Solution {
    public String reverseWords(String s) {
        //remove extra space
        String t = s.trim();     // new string to use

        String st[] = t.split("\\s+");    // split() : O(n)

        StringBuilder sb = new StringBuilder();
        int count=0;

        for(int i=0; i<st.length; i++){
            if(!st[i].equals(" ")){
                sb.insert(0, st[i]);
                sb.insert(0, ' ');
            }
        }

        return sb.toString().trim();

    }
}