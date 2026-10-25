class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 0;
        while (left * left < num) {
            left++;
        }
        return left * left == num;
    }
}