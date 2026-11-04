class Solution {
    public int minSteps(int n) {
        int count = 0;
        if (n <= 1) {
            return 0;
        }
        for (int i = 2; i <=n; i++) {
            while (n % i == 0) {
                count += i;
                n = n / i;
            }

        }
        return count;
    }
}