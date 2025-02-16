class Solution {
    public int maxOperations(int[] nums, int k) {
        // integer, occurrences
        Map<Integer, Integer> seen = new HashMap<>();
        int operationCount = 0;
        for (int num : nums) {
            int neededNum = k - num;
            if (seen.containsKey(neededNum)) {
                // if the set contains the key
                // remove neededNum from the set
                int occurrencesOfNeededNum = seen.get(neededNum);
                if (occurrencesOfNeededNum > 1) {
                    seen.put(neededNum, occurrencesOfNeededNum-1);
                    operationCount++;
                } else {
                    seen.remove(neededNum);
                    operationCount++;
                }
            } else { //  the map doesnt contain the needed num
                // if map contains num increment val by 1
                if (seen.containsKey(num)) seen.put(num, seen.get(num)+1);
                // else instantiate with val 1
                else seen.put(num, 1);
            }
        }
        return operationCount;
    }
}