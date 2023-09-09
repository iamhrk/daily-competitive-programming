// Link - https://leetcode.com/problems/container-with-most-water/
// Author - Harikrishnan Rajagopalan

class Solution {
    public int maxArea(int[] height) {
        int max_amount = 0;
        int left = 0;
        int right = height.length-1;
        while(left < right){
            int width_of_container = right-left;
            int height_of_container = Math.min(height[left], height[right]);
            int amount_of_water = width_of_container * height_of_container;
            max_amount = Math.max(max_amount, amount_of_water);
            if(height[left] < height[right]){
                left++;
            }
            else if(height[right]< height[left]){
                right--;
            }
            else{
                left++;
                right--;
            }
        }
        return max_amount;
    }
}