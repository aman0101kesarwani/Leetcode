class Solution {
    public int pivotIndex(int[] nums) {
        
        int y=0;
        for(int num : nums){
            y+=num;
        }

        int pivot = -1;
        int x = 0;
        for(int i=0; i<nums.length; i++){
            if(2 * x + nums[i] == y){
                pivot = i;
                break;
            }
            x+=nums[i];
        }

        return pivot;
    }
}