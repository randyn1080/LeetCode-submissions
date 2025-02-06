class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> seenInts = new HashSet<>();
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                if (seenInts.contains(nums[i])) {
                    // do nothing, already has one duplicate                
                } else {
                    // else add to dictionary and reformed array
                    seenInts.add(nums[i]);
                    nums[k++] = nums[i];
                }
            } else {
                nums[k++] = nums[i];
            }        
        }
        return k;
    }
}