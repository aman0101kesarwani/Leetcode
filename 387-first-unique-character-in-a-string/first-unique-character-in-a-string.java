class Solution {
    public int firstUniqChar(String s) {
        //m1 : using freq array: two for each individual , one for storing , second for readind and checking if freq==1

        int freq[] = new int[26];  // 26 as only small/one-type letter;

        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(freq[c - 'a'] == 1){
                return i;
            }
        }

        return -1;

    }
}
