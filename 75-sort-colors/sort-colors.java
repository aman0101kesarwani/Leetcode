class Solution {
    public void sortColors(int[] nums) {

        for (int left = 0; left < nums.length; left++) {

            int minIndex = left;

            for (int right = nums.length - 1; right > left; right--) {

                if (nums[right] < nums[minIndex]) {
                    minIndex = right;
                }
            }

            int temp = nums[left];
            nums[left] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }
}