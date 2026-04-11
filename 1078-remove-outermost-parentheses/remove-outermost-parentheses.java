class Solution {
    public String removeOuterParentheses(String s) {
        
        // ( ( ) ( ) ) ( ( ) ) ( ( ) ( ( ) ) )
//         i                                        skip , count++
//           i                                      add  , count++
//             i                                    add  , count--
//               i                                  add  , count++                         
//                 i                                add  , count--
//                   i                              add  , count--          , and so on

        StringBuilder sc = new StringBuilder();

        int count = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(count>0) sc.append(ch);
                count++;
            }
            else{    // ch == ")"
                count--;
                if(count>0) sc.append(ch);
            }
        }


        return sc.toString();

    }
}