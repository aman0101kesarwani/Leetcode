class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        for(int i=0; i<n1; i++){
            int num = nums1[i];

            int j=0; 
            while(num!=nums2[j]) j++;

            for(int k=j+1; k<n2; k++){
                if(num<nums2[k]){
                    nums1[i]=nums2[k];
                    break;
                }
            }
            if(num == nums1[i]){
                nums1[i]=-1;
            }
        }

        return nums1;
        
    }
}