class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        m--;
        n--;
        for(int i = m + n + 1; i >= 0; i--){
            if(n < 0) break;

            if(m < 0){
                nums1[i] = nums2[n];
                n--;
            }
            else if(nums2[n] > nums1[m]){
                nums1[i] = nums2[n];
                n--;
            }
            else{
                nums1[i] = nums1[m];
                m--;
            }
        }
    }
}