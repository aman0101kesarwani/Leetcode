class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        
        int pos = nums .length-1;

        int arr[] = new int[nums.length];

        while(left<=right){
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];

            if(leftsq < rightsq){
                arr[pos--] = rightsq;
                right--;
            }
            else{
                arr[pos--] = leftsq;
                left++;
            }
        }

        return arr;
        
    }
}