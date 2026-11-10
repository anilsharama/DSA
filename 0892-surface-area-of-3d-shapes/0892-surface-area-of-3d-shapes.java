class Solution {
    public int surfaceArea(int[][] grid) {
        int ans =0 ;
        int n = grid.length;
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                int h = grid[i][j];
                if(h > 0){
                    ans+=4*h+2;
                    if(i > 0){
                        ans-=2*Math.min(h , grid[i-1][j]);
                    }
                    if(j>0){
                        ans-=2*Math.min(h,grid[i][j-1]);
                    }
                }
            }
        }
        return ans;
    }
}