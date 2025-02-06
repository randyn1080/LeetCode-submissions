class Solution {
    public int maxArea(int[] height) {
        int leftWall = 0;
        int rightWall = height.length-1;
        int maxVal = 0;

        while (leftWall < rightWall) {
            int x = rightWall - leftWall;
            int rightWallHeight = height[rightWall];
            int leftWallHeight = height[leftWall];
            int y = Math.min(rightWallHeight, leftWallHeight);
            
            maxVal = Math.max(maxVal, x * y);

            if (rightWallHeight < leftWallHeight) {
                // move right wall
                rightWall--;
            } else {
                // else if rightwallheigt >= leftwallheight 
                // move left wall
                leftWall++;
            }
        }
        return maxVal;
    }
}