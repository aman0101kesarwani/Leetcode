class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];

        for(int i=0; i<first.length(); i++){
            String prefix = first.substring(0,i+1);

            for(int j=0; j<strs.length; j++){
                if(!strs[j].startsWith(prefix)){
                    return first.substring(0,i);
                }
            }
        }

        return first;
        
    }
}