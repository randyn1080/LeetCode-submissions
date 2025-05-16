class Solution {
    public String reverseWords(String s) {
        // first, create an array with the words
        String[] strArr = s.trim().split("\\s+");

        // Now strArr has our words, iterate through it backwards adding each word to a SB
        StringBuilder sb = new StringBuilder();
        for (int i = strArr.length-1; i >= 0; i--) {
            sb.append(strArr[i]);
            if (i > 0)
                sb.append(" ");
        }

        return sb.toString();
    }
}