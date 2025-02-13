class Solution {
    public int pivotIndex(int[] nums) {
        // first get the sum of the entire array
        int totalSum = 0;
        for (int i : nums) totalSum += i;
        // we need to work with the left and right sums for the problem
        int rightSum = totalSum;
        int leftSum = 0;
        // now we loop through the array and 
        // if the left and right sum are equal, we return the id
        for (int i = 0; i < nums.length; i++) {
            // subtract el at one from the rightsum
            // due to strictly clause only hold what is right and left of pointer.
            rightSum -= nums[i];
            // now compare
            if (leftSum == rightSum) return i;
            // comparisons are done so now we need to add 
            // el at i to leftSum
            leftSum += nums[i];
        }
        // if we make it out we didnt find a suitable pivot point
        // return the false condition -1
        return -1;
    }
}