class Solution {
    public String longestCommonPrefix(String[] strs) {
        // first we can sort the array which will give us an easier data set to work with
        Arrays.sort(strs);
        if (strs == null || strs.length == 0 || strs[0].isEmpty())
            return "";
        StringBuilder sb = new StringBuilder();
        // now that strs array is sorted, the strings are organized lexigraphically 
        // so we can logically compare each starting with the first to the last, 
        // first will be the shortest string.

        // compare the first letter.. if it's the same for each, add it to the result
        // continue doing this for each position until we reach the end of the first word OR
        // we run into a letter that isnt the same.
        for (int i = 0; i < strs[0].length(); i++) {
            // hold the current iteration of strs[0] letter in letter variable
            char letter = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                // for each in strs, check that the letter matches
                if (strs[j].charAt(i) != letter) {
                    return sb.toString();
                }
            }
            sb.append(letter);
        }
        return sb.toString();
    }
}