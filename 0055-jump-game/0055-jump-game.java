class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length-1;
        for (int i = goal-1; i >= 0; i--) {
            if (nums[i] >= goal-i){ // if nums[i] leads to goal, update it as the goal
                goal = i;
            }
        }
      return goal == 0;
    }
}