class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        int[] result = new int[2];
        int index = 0;
        
        for (int num : nums) {
            if (!mySet.add(num)) {  // add() returns false if already present
                result[index++] = num;
                if (index == 2) break;  // Early exit
            }
        }
        return result;
    }
}