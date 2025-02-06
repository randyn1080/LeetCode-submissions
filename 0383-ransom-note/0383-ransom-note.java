class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // create a map with the letter and the occurrences of ransomNote
      // then compare to what is in the mag. If evertything in ransomNote
      // is in mag, return true because the ransom note can be constructed
      // from the mag
      Map<Character, Integer> magLetters = new HashMap<>();
      for (int i = 0; i < magazine.length(); i++) {
         
         char charHolder = magazine.charAt(i);
         if (magLetters.containsKey(charHolder)) {// if the letter is already in the map
            // increment the integer 
            int valHolder = magLetters.get(charHolder) + 1;
            // assign tempHolder to the value associated with charHolder.
            magLetters.put(charHolder, valHolder);
         } else {
            // add it to the map with int 1
            magLetters.put(charHolder, 1);
         }
      
      } // after this loop we have a dictionary of the letters and their occurrences
      // in magazine.
      // Now we can check it against what's in the ransomNote
      for (int j = 0; j < ransomNote.length(); j++) {
         
         char curChar = ransomNote.charAt(j);
         if (magLetters.containsKey(curChar)) { // if the letter is in magLetters, increment the charHolder 1 down
                                     // or delete if it is 1
            if (magLetters.get(curChar) == 1) {
               // remove it
               magLetters.remove(curChar);
            } else { // else is if counter val is > 1
               // increment counter val down 1
               int tempVal = magLetters.get(curChar) - 1;
               magLetters.put(curChar, tempVal);
            }
            
         } else {// if does not contain curChar as a key, mag doesn't have the necessary letters for ransomNote
            return false;
         }
      
      } 
      
      return true;
    }
}