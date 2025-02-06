class Solution {
public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        int columns = (s.length() / 2) + 1;
        char[][] arr = new char[numRows][columns];

        int row = 0;
        int column = 0;
        int strId = 0;
        while (strId < s.length()) {
            while (row < numRows-1 && strId < s.length()) {
                arr[row][column] = s.charAt(strId++);
                row++;
            }
            while (row > 0 && strId < s.length()) {
                arr[row][column] = s.charAt(strId++);
                row--;
                column++;
            }
        }

        StringBuilder returnStr = new StringBuilder("");
        for (int i = 0; i < numRows; i++) {
            // get row
            char[] currentRow = arr[i];
            for (char c : currentRow) {
                if (c != '\u0000') {
                    returnStr.append(c);
                }
            }
        }

        return returnStr.toString();
    }
}