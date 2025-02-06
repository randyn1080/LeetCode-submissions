class Solution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            // for every non-unique key, add 1 to the value
            if (letters.containsKey(s.charAt(i))) {
                int num = letters.get(s.charAt(i));
                letters.replace(s.charAt(i), num+1);
            }
            // for every unique key in s, add the key and val: 1
            else {
                letters.put(s.charAt(i), 1);
            }
        }


        // now we check t
        for (int i = 0; i < t.length(); i++) {
            if (!letters.containsKey(t.charAt(i)))
                return false;
            // if the key exists, check if 0
            int numb = letters.get(t.charAt(i));
            if (numb == 0){
                return false;
            }
            // negate one from the val
            letters.replace(t.charAt(i), numb-1);
        }

        return true;
    }
}