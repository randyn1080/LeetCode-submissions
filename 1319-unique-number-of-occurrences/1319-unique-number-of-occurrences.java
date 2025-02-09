class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!myMap.containsKey(arr[i])) {
                // add to map
                myMap.put(arr[i], 1);
            } else {
                // map contains key
                // add one to the value
                myMap.put(arr[i], myMap.get(arr[i]) + 1);
            }
        }
        // now have a map with the key : integer and value : occurences
        // we need to determine if any of the values are the same
        // most effective ways of doing that: 
        // we can make a set with all of the values by going through the map
        // and adding each to a set. If they are all unique then the set length
        // will equal the map length
        Set<Integer> mySet = new HashSet<>();
        myMap.forEach((k, v) -> {
            mySet.add(v);
        });
        int setSize = mySet.size();
        int mapSize = myMap.size();
        return setSize == mapSize;
    }
}