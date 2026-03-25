class Solution {
    public int missingNumber(int[] nums) {
        int arr[] = new int[nums.length+1];

        for(int num : nums){
            arr[num]++;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                return i;
            }

        }

        return 0;
    }
}
