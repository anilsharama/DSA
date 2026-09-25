class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        int n  = nums.length;
        for(int i=0;i<n;i++){
            if (ans.contains(nums[i])){
                return true;
            }
            ans.add(nums[i]);
        }
        return false;
    }
}