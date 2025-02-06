class Solution {
        public static void rotate(int[] arr, int k) {
        int count = 0;

        for (int i = 0; count < arr.length; i++) {
            int currentId = i;
            int savedVal = arr[currentId];

            do {
                int nextId = loopIterator(currentId, k, arr.length);
                int temp = arr[nextId];
                arr[nextId] = savedVal;
                savedVal = temp;
                currentId = nextId;
                count++;
            } while (currentId != i);

        }
    }
    public static int loopIterator(int currentId, int steps, int arrSize) {
        return ((currentId + steps) % arrSize);
    }
}