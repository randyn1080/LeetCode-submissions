class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!intMap.containsKey(nums[i])) {
                intMap.put(nums[i], i);
            } else { // contains key
                // if it contains the key
                // we need to see if the difference between
                // the first occurences index( currently in the map)
                // is <= k. if it is return true, else continue 
                int firstOccurrenceID = intMap.get(nums[i]);
                int diff = i - firstOccurrenceID;
                if (diff <= k) {
                    return true;
                } else {
                    intMap.put(nums[i], i);
                }
            }
        }
        // if we never returned true then we never found a duplicate,
        return false;
    }
}