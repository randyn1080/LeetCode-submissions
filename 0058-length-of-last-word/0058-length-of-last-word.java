class Solution {
    public int lengthOfLastWord(String s) {
        // iterate through the string to get the answer
        // instead of using space
        // worst case space o(1) time still 0(n) but better
        int lngth = s.length()-1;
        int maxLn = 0;
        while (lngth >= 0 && s.charAt(lngth) == ' ') {
            lngth--;
        }
        while (lngth >= 0 && s.charAt(lngth) != ' ') {
            maxLn++;
            lngth--;
        }
        return maxLn;
    }
}