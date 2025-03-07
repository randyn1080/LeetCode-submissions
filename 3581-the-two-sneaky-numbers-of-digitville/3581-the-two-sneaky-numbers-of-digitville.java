class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        List<Integer> myList = new ArrayList<>();
        for (int num:nums){
            if (mySet.contains(num)) {
                myList.add(num);
            } else {
                mySet.add(num);
            }
        }
        return myList.stream().mapToInt(Integer::intValue).toArray();
    }
}