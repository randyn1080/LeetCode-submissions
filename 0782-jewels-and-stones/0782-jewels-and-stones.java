class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // look at jewel pile
        Set<Character> jewelSet = new HashSet<>();
        // memoize
        for (int i = 0; i < jewels.length(); i++) {
            jewelSet.add(jewels.charAt(i));
        }
        // look at stone pile
        // check for letters from the jewel pile
        // if we find one, its a jewel, add to the jewel counter
        int jewelCount = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewelSet.contains(stones.charAt(i))){
                jewelCount++;
            }
        }
        
        // return the jewel counter
        return jewelCount;
    }
}