class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder("");
        // if the first string is the longest
        // find the shortest first and base the rest off that
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            minLength = Math.min(minLength, strs[i].length());
        }
        // search the arrays 
        // look at the first letter of the first string
        // save it as tempPrefix
        // check every first letter of every string
        // set sentinal value to false if we encounter a first letter that isnt
        // the same as tempPrefix
        // once we reach the last str, if sent val is true then add the temp prefix
        // to the actual stringbuilder prefix. if it is false break the entire loop
        // and return whatever is in sb.toString();
        boolean sentVal = true;
        for (int i = 0; i < minLength; i++) {
            char tempPrefix = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != tempPrefix){
                    sentVal = false;
                    break;
                }
            }
            if (sentVal) {
                sb.append(strs[0].charAt(i));
            } else break;
        }
        return sb.toString();
    }
}