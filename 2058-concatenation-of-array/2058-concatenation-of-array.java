class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] concatArr = new int[nums.length*2];
        for(int i = 0; i < concatArr.length; i++) {
            concatArr[i] = nums[i%nums.length];
        }
        return concatArr;
    }
}