class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> charOccurrencesMap = new LinkedHashMap<>();
        Map<Character, Integer> firstOccurrenceIndexMap = new HashMap<>();
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (!firstOccurrenceIndexMap.containsKey(charArr[i])) {
                // doesnt contain key, put key in with i as index
                firstOccurrenceIndexMap.put(charArr[i], i);
            }
            charOccurrencesMap.put(charArr[i], charOccurrencesMap.getOrDefault(charArr[i],0)+1);
        }

        // debug statments
        System.out.println("first occurrences index map : ");
        firstOccurrenceIndexMap.forEach((k,v)->System.out.println("Key: " + k + ", Value: " + v));
        
        System.out.println("char occurrences map : ");
        charOccurrencesMap.forEach((k,v)->System.out.println("Key: "+k+", Value: "+v));

        

        for (char c : charOccurrencesMap.keySet()) {
            if (charOccurrencesMap.get(c) == 1) {
                return firstOccurrenceIndexMap.get(c);
            }
        }

        return -1;
    }
}