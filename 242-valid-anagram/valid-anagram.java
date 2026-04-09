class Solution {
    public boolean isAnagram(String s, String t) {
        //m1: using freq array
        //m2: using HashMap

        int freq[] = new int[26];

        for(char c: s.toCharArray()){
            freq[c - 'a']++;
        }

        for(char c : t.toCharArray()){
            freq[c - 'a']--;
        }

        for(int i=0; i<freq.length; i++){
            if(freq[i]!=0) return false;
        }

        return true;
    }
}