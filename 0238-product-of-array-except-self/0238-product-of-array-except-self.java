class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixArr = new int[nums.length];
        int currentPrefix = 1;
        prefixArr[0] = 1;
        for (int i = 0; i < prefixArr.length-1; i++) {
            currentPrefix *= nums[i];
            prefixArr[i+1] = currentPrefix;
            
        }
        int suffixProduct = 1;
        int numsId = nums.length-1;
        for (int i = nums.length-2; i >= 0; i--) {
            suffixProduct *= nums[numsId--];
            prefixArr[i] *= suffixProduct;
        }

        return prefixArr;
    }
}