class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int ans2 = 0;
        int n = prices.length;
        int low = prices[0];
        for (int i = 0; i < n; i++) {
            if (prices[i] < low) {
                low = prices[i];
            }
           ans = prices[i]-low;
           if(ans2 < ans){
            ans2 = ans;
           }
        }
        return ans2;
    }
}