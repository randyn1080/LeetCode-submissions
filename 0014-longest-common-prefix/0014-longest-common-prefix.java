class Solution {
    public String longestCommonPrefix(String[] strs) {
        // edge case
        if (strs == null || strs.length == 0 || strs[0].isEmpty())
            return "";

        // stringbuilder for building the output
        StringBuilder sb = new StringBuilder();

        // find the shortest string
        int shortestLength = Integer.MAX_VALUE;
        for (String s : strs) {
            shortestLength = Math.min(s.length(), shortestLength);
        }
        // compare the first letter.. if it's the same for each, add it to the result
        // continue doing this for each position until we reach the end of the first word OR
        // we run into a letter that isnt the same.
        for (int i = 0; i < shortestLength; i++) {
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