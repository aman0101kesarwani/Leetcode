class Solution {
    public int dominantIndex(int[] nums) {
        int n= nums.length;

        int max = 0;
        int idx=-1;
        for(int i=0; i<n; i++){
            if(max<nums[i]){
                idx = i;
                max = nums[i];
            }
        }

        for(int i=0; i<n; i++){
            if(i == idx) continue;

            if(2*nums[i]> max){
                return -1;
            } 
            
        }

        return idx;
    }
}