class Solution {
    public int longestOnes(int[] nums, int k) {
        // sliding window
        int leftWall = 0;
        int rightWall = 0;
        int onesCount = 0;
        while (rightWall < nums.length) {
            // first, add 1 if a 1 exists
            onesCount += nums[rightWall];
            // then if the onescount + k is >= our window length
            if ( (onesCount + k) >= (rightWall - leftWall + 1)) {
                // increase window length
                rightWall++;
            } else { // else the sumOfWindow+k is < windowLenght
                // move entire window right, recalculating sumOfWindow
                // subtract the leftWall val from sumOfWindow
                onesCount -= nums[leftWall++];
                rightWall++;
            }
        }
        return rightWall - leftWall;
    }
}