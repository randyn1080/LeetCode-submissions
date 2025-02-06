class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        // make a map with the num being key and id of num being value
        Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i]; // 3
            int diff = target - temp; // 3
            if (numsMap.containsKey(diff)) {
                return new int[] {numsMap.get(diff), i};
            }
            numsMap.put(nums[i], i);
        }

        return ans;
    
    }
}