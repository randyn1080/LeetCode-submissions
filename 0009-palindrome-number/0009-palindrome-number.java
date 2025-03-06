class Solution {
    public boolean isPalindrome(int x) {
        // all negative numbers are false
        String myInt = Integer.toString(x);
        boolean isPal = true;

        int leftP = 0;
        int rightP = myInt.length()-1;

        while (leftP < rightP) {
            if ( !(myInt.charAt(leftP) == myInt.charAt(rightP)) ){
                return false;
            }

            leftP++;
            rightP--;
        }

        return isPal;
    }
}