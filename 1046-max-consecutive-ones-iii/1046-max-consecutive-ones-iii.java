class Solution {
    public int longestOnes(int[] nums, int k) {
        int leftWall = 0;
        int rightWall = 0;
        int sumOfWindow = 0;
        while (rightWall < nums.length) {
            // first, increment the sum of the current window
            sumOfWindow += nums[rightWall];
            // then if the sum + k is >= our window length
            if ( (sumOfWindow + k) >= (rightWall - leftWall + 1)) {
                // increase window length
                rightWall++;
            } else { // else the sumOfWindow+k is < windowLengght
                // move entire window right, recalculating sumOfWindow
                // subtract the leftWall val from sumOfWindow
                sumOfWindow -= nums[leftWall++];
                rightWall++;
            }
        }
        return rightWall - leftWall;
    }
}