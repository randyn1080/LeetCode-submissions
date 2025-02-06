class Solution {
    public static boolean wordPattern(String pattern, String s) {
        // save 0(n) space by only accessing the charAt
        //String[] patternArr = pattern.split("");
        String[] sArr = s.split(" ");
        if (pattern.length() != sArr.length) return false;

        Map<Character, String> patternMap = new HashMap<>();
        Set<String> mappedValues = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            // if the key exists in our map
            if (patternMap.containsKey(pattern.charAt(i))) {
                // return false if the value pair doesn't match
                // REFACTOR GUNNA MESS THIS UP?
                if (!patternMap.get(pattern.charAt(i)).equals(sArr[i])) {
                    return false;
                }// if it did match, do nothing and continue
            } else { // else the pattern doesn't contain the key
                // make sure the value doesn't exist already, and if it does
                // return false
                // accessing a Set to see if it contains something is 0(1)
                // checking for a value in a map is 0(n)
                // thus we use set
                if (mappedValues.contains(sArr[i])) {
                    return false;
                } else {
                    // put the key val pair in
                    patternMap.put(pattern.charAt(i), sArr[i]);
                    mappedValues.add(sArr[i]);
                }
            }
        }

        return true;
    }
}