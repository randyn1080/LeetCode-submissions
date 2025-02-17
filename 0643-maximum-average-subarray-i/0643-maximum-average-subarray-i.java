class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // first get the first sum, then average that by sum / k
        int id = 0;
        int sum = 0;
        while (id < k) {
            sum += nums[id++];
        }
        double avg = (sum*1.00)/k;
        // then, iterate through the array getting
        // the new sum per position by subtracting 1 from the beginning
        // and adding 1 from the back to the sum, then average that by sum / k
        int tailId = 0;
        int tail = 0;
        while (id < nums.length) {
            tail = nums[tailId++];
            sum -= tail;
            sum += nums[id++];
            avg = Double.max(avg, (sum*1.00)/k);
        }
        return avg;
    }
}