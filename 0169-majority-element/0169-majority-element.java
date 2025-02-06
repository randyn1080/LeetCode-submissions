class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            // if the int isn't a key already,
            // make it a key associated with value 1
            if (!map.containsKey(num))
                map.put(num, 1);
            // if the int is a key already
            // increment value by 1
            else
                map.replace(num, map.get(num) + 1);
        }
        // now in our map we have an element with the highest occurrences
        // find it, save it into int ans
        int max = Collections.max(map.values());
        // find the key that is associated with the value
        final int[] returnVal = new int[1];
        map.forEach( (k, v) -> {
            System.out.println(k + " : " + v);
            if (v == max)
                returnVal[0] = k;
        });
        return returnVal[0];
    }
    
}