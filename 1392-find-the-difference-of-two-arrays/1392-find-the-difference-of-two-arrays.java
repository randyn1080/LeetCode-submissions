class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> seenOne = new HashSet<>();
        Set<Integer> seenTwo = new HashSet<>();
        
        List<Integer> arrOne = new ArrayList<>();
        List<Integer> arrTwo = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            seenOne.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            seenTwo.add(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            if (!seenTwo.contains(nums1[i])) {
                arrOne.add(nums1[i]);
                seenTwo.add(nums1[i]);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (!seenOne.contains(nums2[i])) {
                arrTwo.add(nums2[i]);
                seenOne.add(nums2[i]);
            }
        }
        List<List<Integer>> listList = new ArrayList<>();
        listList.add(arrOne);
        listList.add(arrTwo);

        return listList;
    }
}