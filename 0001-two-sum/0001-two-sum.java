class Solution {
    public int[] twoSum(int[] nums, int target) {

        // create a map with the key: num and val: index
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int curr = nums[i];

            // number we need to create target
            int difference = target - curr;
            // search the map for difference.. if it exists, return indexes of curr and difference as our answer
            if (indexMap.containsKey(difference)) {
                return new int[] {i, indexMap.get(difference)};
            }

            indexMap.put(curr, i);
            
        }

        return new int[0];
    }
}