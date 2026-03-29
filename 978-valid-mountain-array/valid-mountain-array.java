class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;

        int max = arr[0];
        int idx = 0;

        // find peak
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }

        // peak cannot be first or last
        if (idx == 0 || idx == arr.length - 1) return false;

        // increasing part
        for (int i = 0; i < idx; i++) {
            if (arr[i] >= arr[i + 1]) return false;
        }

        // decreasing part
        for (int i = idx; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) return false;
        }

        return true;
    }
}