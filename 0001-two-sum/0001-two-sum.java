class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];

        // create a map with the key: num and val: index
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int curr = nums[i];

            // number we need to create target
            int difference = target - curr;
            // search the map for difference.. if it exists, add the index of curr and of difference to output and return
            // them as our answer
            if (indexMap.containsKey(difference)) {
                output[0] = i;
                output[1] = indexMap.get(difference);
                break;
            }
            if (!indexMap.containsKey(curr)) { // do we need to update the index if the map already contains nums[i]?
                indexMap.put(curr, i);
            }
            
        }

        return output;
    }
}