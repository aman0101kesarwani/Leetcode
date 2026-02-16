class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();

        for(char ch : s.toCharArray()){

            //stack only stores opening bracket
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                //closing bracket appeared


                //if the stack is empty , means no opening bracket to match
                if(st.isEmpty()) return false;

                //remove the last one opening bracket 
                char top = st.pop();

                //chech if the correct paired formed 
                if(ch == ')' && top!='(') return false;
                if(ch == '}' && top!='{') return false;
                if(ch == ']' && top!='[') return false;
            }
        }

        return st.isEmpty();
    }
}