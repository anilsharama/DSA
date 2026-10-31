class Solution {
    public int trailingZeroes(int n) {

        int ss = 0;

        while (n >= 5) {
            n = n / 5;
            ss = ss + n;
        }

        return ss;
    }
}