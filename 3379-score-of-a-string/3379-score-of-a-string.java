class Solution {
    public int scoreOfString(String s) {
        int p1 = 0;
        int p2 = 1;
        int sum = 0;
        while (p2 < s.length()) {
            // find the diff of chars at p1 and p2;
            int tempNum = Math.abs(s.charAt(p1++) - s.charAt(p2++));
            sum += tempNum;
        }
        return sum;
    }
}