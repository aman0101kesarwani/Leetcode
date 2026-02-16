class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder sc = new StringBuilder();

        int count = 0;

        for(char ch : s.toCharArray()){
            if(ch=='('){
                if(count>0) sc.append(ch);
                count++;
            }
            else{
                count--;
                if(count>0) sc.append(ch);
            }
        }

        return sc.toString();

    }
}