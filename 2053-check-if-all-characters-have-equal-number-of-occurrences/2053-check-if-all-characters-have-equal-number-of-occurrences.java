class Solution {
    public boolean areOccurrencesEqual(String s) {
        if (s.length() < 2) {
            return true;
        }
        // create a map of the characters in s
        Map<Character, Integer> charMap = new HashMap<>();
        for (Character c : s.toCharArray()){
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        // look through the map return false once we encounter a value that is different (they must all be the same)
        int firstResult = charMap.get(s.charAt(0));

        for (int i : charMap.values()) {
            if (i != firstResult) {
                return false;
            }
        }
 
        return true;
    }
}