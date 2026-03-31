class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();

        int n = nums.length;

        for(int num : nums){
            set.add(num);
        }

        List<Integer> list = new LinkedList<>();   //linkedlist , not arraylist

        for(int i=1; i<=nums.length; i++){     // < = nums.length , not < nums.length
            if(!set.contains(i)){               // i , not nums[i]
                list.add(i);
            }
        }

        return list;
    }
}