// Link - https://leetcode.com/problems/two-sum
// Author - Harikrishnan Rajagopalan

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length-1; i++){
            int current_num = nums[i];
            for(int j = i+1; j<nums.length;j++){
                int next_num = nums[j];
                if(next_num + current_num == target){
                    return new int[]{i,j};
                } 
            }
        }
        return new int[]{};
    }
}