class Solution {
    public int compress(char[] chars) {
        int charLength = chars.length;
        int i = 0;
        int idToWrite = 0;

        while (i < charLength) {
            char tempChar = chars[i];
            int occurrences = 0;

            // increment count for each similar thing
            while (i < charLength &&
            chars[i] == tempChar) {
                i++;
                occurrences++;
            }
            
            // now write the letter to the char array
            chars[idToWrite++] = tempChar;
            // and write the count if the occurrences is > 1
            if (occurrences > 1) {
                String occurStr = String.valueOf(occurrences);
                for (char c : occurStr.toCharArray()) {
                    chars[idToWrite++] = c;
                }
            }
        }
        return idToWrite;
    }
}