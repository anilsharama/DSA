class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int  jump = 0;
        int end = 0;
        int far = 0;

        for(int i=0;i<n-1;i++){
            far = Math.max(far , i+nums[i]);

            if(i == end ){
                jump++;
                end = far;
            }
        }
        return jump;
    }
}