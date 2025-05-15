class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String s : strs) {
            
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedLetters = new String(chars);

            // check if it's in the map
            if (!anagramGroups.containsKey(sortedLetters)) {
                // if it isn't, name a new grouping with the sortedLetters as key
                anagramGroups.put(sortedLetters, new ArrayList<>());
            } 

            // add it to the proper list in the map
            anagramGroups.get(sortedLetters).add(s);
            
        }

        return new ArrayList<>(anagramGroups.values());
    }
}