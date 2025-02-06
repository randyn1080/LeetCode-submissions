class Solution {
    public int removeElement(int[] nums, int val) {
        // find val in nums;
        // swap val to end of array position, checking end of array for val
        // check initial position again since we could have swapped for val
      
        int i = 0;
        int j = nums.length - 1;
        int tempContainer;
        // counter for integers that are not val in nums
        int count = 0;
        while (i <= j) {
            // in this condition, we've found a val, so we need to
             // move it to the end of the array
            if (nums[i] == val) {
         
                // hold value from end of array
                tempContainer = nums[j];
                nums[j] = nums[i];
                j--;
                nums[i] = tempContainer;
         
            } else {
         
                count++;
                i++;
         
            }
      
        }
      return count;
    }
}