class Solution {
    public boolean isHappy(int n) {
        Set<Integer> numsEncountered = new HashSet<Integer>();
        boolean duplicate = false;
        int newNum = n;
        while (!duplicate) {
            newNum = processNum(newNum);
            if (newNum == 1) return true;
            duplicate = !numsEncountered.add(newNum);
        }
        return false;
    }
        public int processNum(int n) {
        int sum = 0;
        while (n > 0) {
            int toSquare = n % 10;
            sum += toSquare * toSquare;
            n /= 10;
        }
        // split num

        return sum;
    }
    
}