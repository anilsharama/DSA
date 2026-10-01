class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> ans = new HashSet<>();
        while(n != 1){
            if(ans.contains(n)){
                return false;
            }
            ans.add(n);

            int sum =0;
            while(n > 0){
                int mm = n%10;
                sum = sum+mm*mm;
                n = n/10;
            }
            n=sum;
        }
        return true;
    }
}