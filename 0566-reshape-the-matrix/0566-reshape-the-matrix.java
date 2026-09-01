class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        int [][]dp =new int [r][c];
        if(n*m != r*c){
            return mat;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int index = i*m+j;

                int row = index/c;
                int colum = index%c;
                dp[row][colum] = mat[i][j];
            }
        }
        return dp;
    }
}