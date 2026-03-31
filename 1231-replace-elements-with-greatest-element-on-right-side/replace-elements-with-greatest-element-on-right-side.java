class Solution {
    public int[] replaceElements(int[] arr) {
        
        //brute force :
        int n=arr.length;
        int max = -1;

        for(int i=0; i<n; i++){
            max=-1;
            for(int j=i+1; j<n; j++){
               max=Math.max(max, arr[j]); 
            }

            arr[i]=max;
        }

        return arr;
        
    }
}