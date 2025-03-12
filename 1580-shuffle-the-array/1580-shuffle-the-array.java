class Solution {
    public int[] shuffle(int[] nums, int n) {
        // first iteration lets create a new array to fill
        int[] shuffledArr = new int[2*n];

        // shuffle the arr
        // pointers
        int xPointer = 0;
        int yPointer = n;
        for (int i = 0; i < shuffledArr.length; i++) {
            // maintain two pointers, one pointing to x1, one pointing to y1
            // y1 starts at n
            shuffledArr[i++] = nums[xPointer++];
            shuffledArr[i]   = nums[yPointer++];
        }

        return shuffledArr;
    }
}