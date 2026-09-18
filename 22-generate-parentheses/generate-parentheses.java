class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        int left = 0;
        int right = 0;
        String ans = "";
        helper(n, ans, list, left, right);
        return list;
    }

    public void helper(int n, String ans, List<String> list, int left, int right){
        if(ans.length()==2*n){
            list.add(ans);
            return;
        } 
        
        if(left<n){
            helper(n, ans+"(", list, left+1, right);
        }
        if(left>right){
            helper(n, ans+")", list, left, right+1);
        }
    }
}