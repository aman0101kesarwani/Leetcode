class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;

        // for each index, find max element on its right
        for (int i = 0; i < n; i++) {
            int max = -1; // default for last element

            // scan right side to find maximum
            for (int j = i + 1; j < n; j++) {
                max = Math.max(max, arr[j]);
            }

            arr[i] = max; // replace current with right-side max
        }

        return arr;
    }
}