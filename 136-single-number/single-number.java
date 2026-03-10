class Solution {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        int i=1;
        while(i<nums.length){
            res = res ^ nums[i];
            i++;
        }
        return res;
    }
}
