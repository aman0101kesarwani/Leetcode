class Solution {
    public int firstUniqChar(String s) {
        //m1 : using freq array: two for each individual , one for storing , second for readind and checking if freq==1

        //m2: using map : existance + counting

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.get(c)==1){
                return i;
            }
        }

        return -1;

    }
}
