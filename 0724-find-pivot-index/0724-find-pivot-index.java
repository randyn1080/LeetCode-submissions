class Solution {
    public int pivotIndex(int[] nums) {
        // first get the sum of the entire array
        int totalSum = 0;
        for (int i : nums) totalSum += i;
        // now we have the total sum, we need to work with the left and right sums for the problem
        int rightSum = totalSum;
        int leftSum = 0;
        // now we loop through the array and 
        // if the left and right sum are equal, we return the id
        // if we reach a spot where the leftsum is greater than the rightsum
        // then we return -1 (false condition) since we cannot possibly have a 
        // match in this scenario
        for (int i = 0; i < nums.length; i++) {
            // set the pointer to 0 and in doing so
            // subtract el at one from the rightsum
            // due to strictly clause
            rightSum -= nums[i];
            // now compare
            if (leftSum == rightSum) return i;
            //if (leftSum > rightSum) return -1;
            // comparisons are done so now we need to add 
            // el at i to leftSum
            leftSum += nums[i];
        }
        return -1;
    }
}