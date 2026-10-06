class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans= new ArrayList<>();
        int curr = 0;
        int i = num.length-1;


        while(i >= 0 ||k > 0 ||curr > 0){
            int nn=0;
            if(i >= 0){
                nn = num[i];
                i--;
            }

            int digitk = k%10;
            k = k/10;


            int sum =  nn + digitk+curr;

            ans.add( sum%10);
            curr = sum/10;

        }
        Collections.reverse(ans);
        return ans;
    }
}