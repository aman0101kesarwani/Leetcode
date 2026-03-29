class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int n = nums.length;
        int slow = 0; // position to place next even number

        for (int fast = 0; fast < n; fast++) {

            // If current element is even
            if (nums[fast] % 2 == 0) {
                
                // Swap with slow pointer
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;

                slow++; // move slow to next position
            }
        }

        return nums;
    }
}