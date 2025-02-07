class Solution {
    public String reverseVowels(String s) {
        // two pointers solution
        // start at either end of the string
        // move a pointer till each are on a vowel
        // then flip them
        if (s.length() <= 1) {
            return s;
        }

        Set<Character> charSet = new HashSet<>();
        charSet.add('a');
        charSet.add('e');
        charSet.add('i');
        charSet.add('o');
        charSet.add('u');
        charSet.add('A');
        charSet.add('E');
        charSet.add('I');
        charSet.add('O');
        charSet.add('U');

        char[] charArr = s.toCharArray();

        int leftP = 0;
        int rightP = s.length()-1;
        while (leftP < rightP) {
            char LCleftChar = s.charAt(leftP);
            char LCrightChar = s.charAt(rightP);
            if (charSet.contains(LCleftChar) && 
                charSet.contains(LCrightChar)) {
                // swap
                // dont use the lower case, use the positions
                // and increment/decrement them

                // THE SWAP
                charArr[leftP] = s.charAt(rightP);
                charArr[rightP] = s.charAt(leftP);

                leftP++;
                rightP--;
            }
            else if (charSet.contains(LCleftChar)){
                rightP--;
            } 
            else if (charSet.contains(LCrightChar)) {
                leftP++;
            } else { // both constants
                leftP++;
                rightP--;
            }
        }
        String answer = new String(charArr);
        return answer;
    }
}