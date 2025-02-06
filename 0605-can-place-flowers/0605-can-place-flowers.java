class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int totalFlowersPossible = 0;
        if (n == 0) {
            return true;
        }
        if (flowerbed.length == 1) {
            if (flowerbed[0] == 1){
                return false;
            }else {
                return true;
            }
        }
        for (int i = 1; i < flowerbed.length; i++) {
            if (i == 1 &&(flowerbed[i-1] == 0 && flowerbed[i] == 0)) {
                flowerbed[i-1] = 1;
                totalFlowersPossible++;
            }
            if (i == flowerbed.length-1) {
                if (flowerbed[i] == 0 && flowerbed[i-1] == 0) {
                    totalFlowersPossible++;
                    flowerbed[i] = 1;
                } else {
                    break;
                }
            }
            if (flowerbed[i] == 1) {
                // do nothing
            } else if (flowerbed[i] == 0){
                // determine if the slot prior and after this can house a flower
                // if there are 0's in both of those spots, it can.
                if (flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                // can add 1 flower
                totalFlowersPossible++;
                flowerbed[i] = 1;
                }
            } 
      
        }
      return totalFlowersPossible >= n;
    }
}