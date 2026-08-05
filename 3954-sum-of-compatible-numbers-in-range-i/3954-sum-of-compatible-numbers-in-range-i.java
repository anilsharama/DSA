class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum = 0;

        int start = Math.max(0, n - k);
        int end = n+k;

        for (int i = start; i <= end; i++) {
            if ((n & i) == 0) {
                sum += i;
            }
        }
        return sum;
    }
}