class Solution {
    public int firstUniqChar(String s) {
        // char in s : occurrences
        Map<Character, Integer> occurrencesMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            // add to map or increment chars occurrence by 1
            occurrencesMap.put(temp, occurrencesMap.getOrDefault(temp, 0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            int occurrences = occurrencesMap.get(s.charAt(i));
            if (occurrences == 1) {
                return i;
            }
        }

        return -1;
    }
}