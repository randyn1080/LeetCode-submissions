class Solution {
    public void moveZeroes(int[] nums) {
        int pOne = 0;
        for (int pTwo = 0; pTwo < nums.length; pTwo++) {
            if (nums[pTwo] != 0) {
                // if pTwo is not zero, swap it with pOne
                int temp = nums[pTwo];
                nums[pTwo] = nums[pOne];
                nums[pOne] = temp;
                pOne++;
            }
            // if zero, continue loop to increment pTwo without incrementing pOne
        }
    }
}