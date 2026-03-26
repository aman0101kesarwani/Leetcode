class Solution {
    public void duplicateZeros(int[] arr) {
        int[] res = new int[arr.length];
        int pos = 0;

        for (int i = 0; i < arr.length; i++) {

            if (pos < arr.length) {
                res[pos++] = arr[i];
            }

            if (arr[i] == 0 && pos < arr.length) {
                res[pos++] = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = res[i];
        }
    }
}