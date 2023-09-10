// Link - https://leetcode.com/problems/permutations/
// Author - Harikrishnan Rajagopalan

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answers = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        backtrack(answers, ds, nums);
        return answers;
    }

    private void backtrack(List<List<Integer>> answers, List<Integer> ds, int[] nums){
        if(ds.size() == nums.length){
            answers.add(new ArrayList<>(ds));
            return;
        } else {
            for(int i = 0; i < nums.length; i++){
                if( ds.contains(nums[i])){
                    continue;
                }
                ds.add(nums[i]);
                backtrack(answers, ds, nums);
                ds.remove(ds.size()-1);
            }
        }
    }
}