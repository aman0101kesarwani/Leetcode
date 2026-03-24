class Solution {
    public void moveZeroes(int[] arr) {
        int slow=0;

        for(int fast=1; fast<arr.length; fast++){
            if(arr[slow]==0 && arr[fast]!=0){
                int temp = arr[slow];
                arr[slow]=arr[fast];
                arr[fast]=temp;

                slow++;
            }
            else if(arr[slow]==0 && arr[fast]==0){
                continue;
            }
            else{
                slow++;
            }
        }
    }
}
