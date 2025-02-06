class Solution {
    public String reverseWords(String s) {
        StringBuilder finalString = new StringBuilder();
        String[] sArr = s.trim().split(" ");

        for (int i = sArr.length-1; i > 0; i--) {
            if (!sArr[i].equals("")) {
                finalString.append(sArr[i]);
                finalString.append(" ");
            }
        }
        if (!sArr[0].equals("")) {
            finalString.append(sArr[0]);
        }

        return finalString.toString();
    }
}