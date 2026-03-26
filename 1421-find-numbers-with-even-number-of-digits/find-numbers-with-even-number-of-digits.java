class Solution {
    public int findNumbers(int[] nums) {
        int count =0 ;
        int digits =0;

        for(int num : nums){
            if(num == 0){
                digits =1;
            }else{
                digits = (int)Math.log10(num) +1;
            }

            if(digits % 2 == 0){
                count++;
            }
        }

        return count;
    }
}