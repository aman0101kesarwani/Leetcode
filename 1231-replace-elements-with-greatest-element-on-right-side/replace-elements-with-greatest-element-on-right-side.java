class Solution {
    public int[] replaceElements(int[] arr) {
        
        int n = arr.length;

        int max = -1;
        for(int i=arr.length-1; i>=0; i--){
            int current = arr[i];  // store original
            arr[i] = max;          // replace with right max
            max = Math.max(max, current); // update max
        }

        return arr;
    }
}