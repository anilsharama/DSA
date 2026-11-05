class Solution {
    public int integerBreak(int n) {
        if(n ==2)return 1;
        if(n==3)return 2;
         
         int mul = 1;
         while( n > 4 ){
            mul = mul*3;
            n=n-3;
         }
         mul = mul*n;
         return mul;
    }
}