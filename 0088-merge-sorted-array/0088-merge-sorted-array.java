class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
        // create two seperate arrays, one to hold nums1 values and one to hold nums2 values
      int i = 0;
      int j = 0;
      int[] tempnums1 = new int[m];
      int[] tempnums2 = new int[n];
      
      while (i < m || j < n) {
      
         if (i<m && j<n) {
            tempnums1[i] = nums1[i++];
            tempnums2[j] = nums2[j++];
         } else if (i<m){
            tempnums1[i] = nums1[i++];
         } else if (j<n){
            tempnums2[j] = nums2[j++];
         }
         
      }
      // the size of the arrays is m and n;
      int sizeOfFinal = m + n;
      // perform merge sort on the two sorted arrays into the originam array nums1
      i = 0; j = 0;
      for (int l = 0; l < sizeOfFinal; l++) {
      
         if (i < m && j < n) {
            if (tempnums1[i] < tempnums2[j]) {
               nums1[l] = tempnums1[i];
               i++;
            } else if (tempnums1[i] > tempnums2[j]) {
               nums1[l] = tempnums2[j];
               j++;
            } else if (tempnums1[i] == tempnums2[j]) {
               nums1[l] = tempnums1[i];
               i++;
            }
         } else if (i < m && !(j < n)) {
            nums1[l] = tempnums1[i];
            i++;
         } else if (j < n && !(i < m)) {
            nums1[l] = tempnums2[j];
            j++;
         }
      }
    
    }
}