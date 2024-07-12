class NumMatrix {
int preSum[][];
    public NumMatrix(int[][] matrix) {
     
        int n = matrix.length;
        int m = (n > 0) ? matrix[0].length : 0;
        preSum = new int[n + 1][m + 1];

        // Compute the prefix sum array
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                preSum[i][j] = matrix[i - 1][j - 1] 
                                + preSum[i - 1][j] 
                                + preSum[i][j - 1] 
                                - preSum[i - 1][j - 1];
            }
        }
    }
    
    public int sumRegion(int x1, int y1, int x2, int y2) {
         return preSum[x2 + 1][y2 + 1]
                - preSum[x1][y2 + 1]
                - preSum[x2 + 1][y1]
                + preSum[x1][y1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */