class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int num : nums1){
            set1.add(num);
        }

        for(int num : nums2){
            set2.add(num);
        }

        //intersection

        int[] res = new int[set1.size()];  // as res array will contains value less or equal to any of s1 or s2 which is smaller

        int k=0;

        for(int num : set1){
            if(set2.contains(num)){
                res[k]=num;
                k++;
            }
        }
        
        return Arrays.copyOfRange(res, 0, k);
    }
}