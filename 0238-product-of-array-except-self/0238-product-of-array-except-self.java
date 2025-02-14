class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixArr = new int[nums.length];
        int currentPrefix = 1;
        prefixArr[0] = 1;
        for (int i = 0; i < prefixArr.length-1; i++) {
            currentPrefix *= nums[i];
            prefixArr[i+1] = currentPrefix;
            
        }
        System.out.println("this is prefixArr");
        for (int i : prefixArr) {
            System.out.println(i);
        }
        // we now have [1, 1, 2, 6]
        // we need     [24, 12, 8, 6]
        // from calculating the suffix starting at the end of num
        // is going to be 4, 12, 24
        // so begin at index 1 from last (nums.length-2)
        // and find the suffix product
        // then make that position =
        // suffix product * current position
        int suffixProduct = 1;
        int numsId = nums.length-1;
        for (int i = nums.length-2; i >= 0; i--) {
            // calculate suffix
            suffixProduct *= nums[numsId--];
            prefixArr[i] *= suffixProduct;
        }

        return prefixArr;
    }
}