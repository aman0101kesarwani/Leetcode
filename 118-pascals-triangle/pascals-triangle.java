class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        result.add(new ArrayList<Integer>());
        result.get(0).add(1);   // get subarray of index 0 and add 1 in that

        for(int row=1; row<numRows; row++){
            List<Integer> newRow= new ArrayList<>();  //creating newRow

            newRow.add(1);
            List<Integer> prevRow = result.get(row-1);  //We are just referencing an existing row, not creating prevRow 

            for(int i=1; i<row; i++){
                newRow.add(prevRow.get(i) + prevRow.get(i-1));
            }

            newRow.add(1);
            result.add(newRow);
        }

        return result;
    }
}