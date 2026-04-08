class Solution {
    public int[] findDiagonalOrder(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;

        int[] res = new int[m*n];
        int r = 0,
            c = 0;
        
        int dir = 1;    // 1=up---> right
                        // -1=down--> left
        
        for(int i=0; i<res.length; i++){
            res[i] = mat[r][c];

            //up-right
            if(dir==1){
                r--;
                c++;
                
                if(c==n){
                    c=n-1;
                    r += 2;
                    dir = -1;
                }
                if(r<0){
                    r = 0;
                    dir = -1;
                }

            }
            //down-right
            else{
                r++;
                c--;

                if(r==m){
                    r=m-1;
                    c+=2;
                    dir=1;
                }
                if(c<0){
                    c=0;
                    dir=1;
                }
            }
        }

        return res;
    }
}