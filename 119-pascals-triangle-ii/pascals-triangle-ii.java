class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        int arr[] = new int[rowIndex+1];
        arr[0] = 1;

        for(int i=1; i<arr.length; i++){
            for(int j=i; j>0; j--){
                arr[j] = arr[j] + arr[j-1];
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int num : arr){
            result.add(num);
        }

        return result;
    }
}