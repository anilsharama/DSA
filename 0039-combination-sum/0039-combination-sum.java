
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        find(candidates, target, 0, temp, ans);

        return ans;
    }

    public void find(int[] candidates, int target, int index,
                     List<Integer> temp, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            if (candidates[i] <= target) {

                temp.add(candidates[i]);

                find(candidates, target - candidates[i], i,temp, ans);

                temp.remove(temp.size() - 1);
            }
        }
    }
}
