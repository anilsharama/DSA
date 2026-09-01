class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int m = accounts[0].length;
        int sum = 0;
        int maxlen = 0;

        for (int i = 0; i < n; i++) {
            int line = 0;
            for (int j = 0; j < m; j++) {
                line += accounts[i][j];
            }
            maxlen = Math.max(maxlen, line);
        }
        return maxlen;

    }
}