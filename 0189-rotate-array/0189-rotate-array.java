class Solution {
       public static void rotate(int[] arr, int k) {
        k = k % arr.length;
        if (k == 0 || arr.length <= 1) return;
        // new array
        int[] newArr = new int[arr.length];
        int newArrIndex = 0;
        // first array to be added is the subarray at arr.length-k to arr.length-1
        for (int i = arr.length-k; i < arr.length; i++) {
            newArr[newArrIndex++] = arr[i];
        }
        // second array to be added is the subarray at 0 to arr.length-k
        for (int i = 0; i < arr.length-k; i++) {
            newArr[newArrIndex++] = arr[i];
        }

        for (int i = 0; i < newArr.length; i++) {
            arr[i] = newArr[i];
        }
    }
}