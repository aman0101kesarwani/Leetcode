class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;

        int[] ans = new int[n];

        // copy heights into ans
        for (int i = 0; i < n; i++) {
            ans[i] = heights[i];
        }

        // sort the copied array
        Arrays.sort(ans);

        int count = 0;

        // compare both arrays
        for (int i = 0; i < n; i++) {
            if (heights[i] != ans[i]) {
                count++;
            }
        }

        return count;
    }
}