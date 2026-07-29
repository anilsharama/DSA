class Solution {
    public int[] countBits(int n) {
        int []ans = new int[n+1];
        
        for(int i=0;i<=n;i++){
            int sum = 0;
            int left = i;

            while(left > 0){
                int binary = left % 2;
                sum +=binary;
                left = left/2;
                
            }
             ans[i] = sum;
        }
        return ans;
    }
}