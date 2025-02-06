class Solution {
    public boolean isPalindrome(String s) {
        String modS = s.replaceAll("[^A-Za-z0-9]+", "").toLowerCase();
        int i = 0;
        int j = modS.length()-1;
        while (i < j) {

            if (modS.charAt(i) != modS.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
           
        }
        return true;
    }
}