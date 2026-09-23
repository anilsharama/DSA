class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0){
            return false;
        }
        long i = 1;
        while(i <n){
            i=i*4;
        }
        return i==n;
    }
}