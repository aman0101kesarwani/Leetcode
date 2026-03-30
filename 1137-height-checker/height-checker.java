class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;

        // create sorted copy
        int[] sorted = heights.clone();
        Arrays.sort(sorted);

        int count = 0;

        // compare using frequency logic
        for(int i = 0; i < n; i++){
            if(heights[i] != sorted[i]){
                count++;
            }
        }

        return count;
    }
}