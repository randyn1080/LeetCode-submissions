class Solution {
    public boolean increasingTriplet(int[] nums) {
        int lowest = Integer.MAX_VALUE;
        int middle = Integer.MAX_VALUE;
        for (int num : nums) {
            // set the first smallest num
            if (num <= lowest) {
                // set lowest
                lowest = num;
            // set second smallest num
            } else if (num <= middle) {
                // set middle
                middle = num;
            // num is greater than lowest and middle,
            } else {   
                return true;
            }
        }
        // never found
        return false;
    }
}