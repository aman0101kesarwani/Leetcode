class Solution {
    public int arrayPairSum(int[] nums) {
        //as constraints is not very big,

        // values :(negative)..........0.............(positive)
        // index :   0...............10^4............2x10^4 ====> total index = 2 * 10^4

        int offset = 10000;
        int[] count = new int[2 * 10000 + 1];

        // store frequency
        for (int num : nums) {
            count[num + offset]++;
        }

        int sum = 0;
        boolean take = true; // simulate even index

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {

                if (take) {
                    sum += (i - offset);
                }

                take = !take; // alternate
                count[i]--;
            }
        }

        return sum;
    }
}