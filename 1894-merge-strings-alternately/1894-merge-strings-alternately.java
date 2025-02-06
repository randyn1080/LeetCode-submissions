class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder sb = new StringBuilder("");
        while (i < word1.length() && i < word2.length()) {
            // merge both, i then j, into a new string
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }
        if (i < word1.length()) {
            // finish filling the word with word1        
            while (i < word1.length()) {
                sb.append(word1.charAt(i++));
            }
        } else {
            // finish filling the word with word2 
            // use substring?
            while (i < word2.length()) {
                sb.append(word2.charAt(i++));
            }
        }
        return sb.toString();

    }
}