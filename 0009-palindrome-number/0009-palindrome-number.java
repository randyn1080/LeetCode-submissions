class Solution {
    public boolean isPalindrome(int x) {
        // all negative numbers are false
        if (x < 0) return false;
        // nums 0-9 are true
        else if (x < 10) return true;
        int reversedNum = 0;
        int tempX = x;

        while (tempX > 0) {
            // get the first digit and put it at the left side of a new number
            // so for 121, we would add 1, then turn 1 into 10, then add 2, then turn 12 into 120
            // then add 1, then we would break because tempX will be 0 and we would have the reversed num
            int remainder = tempX % 10;
            reversedNum = (reversedNum*10) + remainder;
            tempX = tempX / 10;
        }


        return reversedNum == x;
    }
}