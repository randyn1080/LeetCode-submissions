class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixArr = new int[nums.length-1];
        int[] suffixArr = new int[nums.length-1];
        int currentPrefix = 1;
        int currentSuffix = 1;
        for (int i = 0, j = suffixArr.length-1; i < suffixArr.length; i++, j--) {
            // i is our prefix iterator
            // j is our suffix iterator
            currentPrefix *= nums[i];
            currentSuffix *= nums[j+1];
            prefixArr[i] = currentPrefix;
            suffixArr[j] = currentSuffix;
        }
        // prefix and suffix arr have been properly filled..
        // now create a loop to return the return array
        int[] returnArr = new int[nums.length];
        int prefixId = 0;
        int suffixId = 0;
        for (int i = 0; i < returnArr.length; i++) {
            // multiply the prefix and suffix arr for nums
            // before and after every index
            // if index is 0 or last one, edge cases
            if (i == 0) {
                returnArr[i] = suffixArr[suffixId++];
            } else if (i == returnArr.length-1) {
                returnArr[i] = prefixArr[prefixId];
            } else {
                int temp = prefixArr[prefixId++] * suffixArr[suffixId++];
                returnArr[i] = temp;
            }
        }
        return returnArr;
    }
}