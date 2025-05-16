class Solution {
    public String reverseWords(String s) {
        // first, create an array with the words
        String[] strArr = s.trim().split(" ");

        // Now strArr has our words, iterate through it backwards adding each word to a SB
        StringBuilder sb = new StringBuilder();
        for (int i = strArr.length-1; i >= 0; i--) {
            if (!strArr[i].equals(""))
                sb.append(strArr[i] + " ");
        }

        return sb.toString().trim();
    }
}