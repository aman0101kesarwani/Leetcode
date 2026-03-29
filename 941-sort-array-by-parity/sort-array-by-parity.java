class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;

        int slow = 0;

        for(int fast = 1; fast<n; fast++){
            if(nums[slow]%2==1 && nums[fast]%2==0){
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;

                slow++;
            }
            else if(nums[slow]%2==0){
                slow++;
            }
        }

        return nums;
    }
}
