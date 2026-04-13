class Solution {
    public String reverseWords(String s) {
        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();

        int i=0;
        while(i<s.length()){
            int j=i;
            while(j<s.length() && s.charAt(j)!=' '){
                word.insert(0,s.charAt(j));
                j++;
            }

            word.append(' ');
            result.append(word);
            word.setLength(0);

            i=j+1;
        }

        return result.toString().trim();
        
        
    }
}