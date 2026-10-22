class Solution {
    public int mySqrt(int x) {
        int count = 0;
        while((long)count*count <= x){
            count+=1;
        }
        return count-1;
    }
}