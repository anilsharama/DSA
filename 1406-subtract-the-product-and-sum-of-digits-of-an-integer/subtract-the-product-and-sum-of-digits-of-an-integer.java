class Solution {
    public int subtractProductAndSum(int n) {
        int i = 0;
        int a = 0;
        int b = 1;
        int c = 0;
        while (i != n) {
            a = n % 10;
            b *= a;
            c += a;
            n = n / 10;
        }
        int ans = b - c;
        return ans;
    }
}