class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftP = 0;
        int rightP = numbers.length-1;
        int[] retArr = new int[2];
        while (leftP < rightP) {
            int leftNum = numbers[leftP];
            int rightNum = numbers[rightP];
            int numsAdded = leftNum + rightNum;
            if (numsAdded == target){
                retArr[0] = leftP+1;
                retArr[1] = rightP+1;
                return retArr;
            }
            if (numsAdded > target) {
                // move the right p down
                rightP--;
            } else { // numsAdded < target
                leftP++;
            }
        }
        return retArr;
    }
}