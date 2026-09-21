class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("+")){
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num2);
                st.push(num1);
                st.push(num1+num2);
            }
            else if(operations[i].equals("D")){
                st.push(2*st.peek());
            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int res=0;
        while(st.size()!=0){
            res = res + st.pop();
        }
        return res;
    }
}