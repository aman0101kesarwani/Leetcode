class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < nums1.length; i++) {

            int num = nums1[i];
            st.push(num);

            int j = 0;
            while (nums2[j] != num) {
                j++;
            }

            for (int k = j + 1; k < nums2.length; k++) {

                if (nums2[k] > st.peek()) {
                    nums1[i] = nums2[k];
                    st.pop();
                    break;
                }
            }

            if (!st.isEmpty()) {
                nums1[i] = -1;
                st.pop();
            }
        }

        return nums1;
    }
}