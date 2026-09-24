class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] heights = new int[n];
        int max = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == '1')
                    heights[j]++;
                else
                    heights[j] = 0;
            }

            int area = largestRectangleArea(heights);
            max = Math.max(max, area);
        }
        return max;
    }
    public int largestRectangleArea(int[] heights){
        int n= heights.length;
        Stack<Integer> ps = new Stack<>();    //enter index
        int[] pse = new int[n];
        pse[0]=-1;
        ps.push(0);
        for(int i=1; i<n; i++){
            while(ps.size()>0 && heights[ps.peek()]>=heights[i]) ps.pop();
            if(ps.size()==0) pse[i]=-1;
            else pse[i]=ps.peek();       //for this we need to store index in stack

            ps.push(i);
        }

        Stack<Integer> ns = new Stack<>();
        int nse[] = new int[n];
        ns.push(n-1);
        nse[n - 1] = n;
        for(int i=n-2; i>=0; i--){
            while(ns.size()>0 && heights[ns.peek()]>=heights[i]) ns.pop();
            if(ns.size()==0) nse[i]=n;
            else nse[i]=ns.peek();    // that's why we stored index in stack

            ns.push(i);
        }

        int max=0;
        for(int i=0; i<n; i++){
            max = Math.max(heights[i]*(nse[i]-pse[i]-1), max);      //max area
        }

        return max;
    }
}