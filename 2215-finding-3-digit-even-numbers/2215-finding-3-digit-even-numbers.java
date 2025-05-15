class Solution {
    public int[] findEvenNumbers(int[] digits) {
        // create return array
        List<Integer> intList = new ArrayList<>();

        for (int i = 100; i < 999; i+=2) {
            // check if it is possible to create i
            // get the digits of i
            int hundredth = i / 100;
            int tenth = (i / 10) % 10;
            int dig = i % 10;

            int[] intArr = {hundredth, tenth, dig};
            int[] localCopy = Arrays.copyOf(digits, digits.length);
            // Check if we can construct this number
            boolean possible = true;
            for (int digit : intArr) {
                boolean found = false;
                for (int j = 0; j < localCopy.length; j++) {
                    if (localCopy[j] == digit) {
                        // Found the digit, mark it as used
                        localCopy[j] = -1;  // Replace with a value that won't match any digit
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    possible = false;
                    break;
                }
            }
            
            if (possible) {
                intList.add(i);
            } 
        }

        return intList.stream().mapToInt(Integer::intValue).toArray();
    }
}