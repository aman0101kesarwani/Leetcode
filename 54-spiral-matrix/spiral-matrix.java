class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int i=0; // position of the row 
        int j=-1;  // column position

        int m=matrix.length;   //row length
        int n=matrix[0].length;  //column length

        int dir = 1; //direction variable

        while(m>0 && n>0){
            for(int k=0; k<n; k++){
                j+=dir;
                result.add(matrix[i][j]);
            }
            m -= 1;

            for(int k=0; k<m; k++){
                i+=dir;
                result.add(matrix[i][j]);
            }
            n-=1;

            dir = dir * -1;  //reverse the direction
        }

        return result;
        
    }
}