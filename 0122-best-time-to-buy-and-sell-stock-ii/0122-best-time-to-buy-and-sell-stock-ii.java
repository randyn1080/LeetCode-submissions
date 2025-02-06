class Solution {
    public int maxProfit(int[] stockPrices) {
        if (stockPrices.length <= 1) {
            return 0;
        }
        int i = 0;
        int j = 1;
        int sumProfit = 0;
        int lowestPrice = Math.min(stockPrices[i], stockPrices[j]);
        i++;
        j++;
        while (j < stockPrices.length) {
            // if there is no stock owned
            if (stockPrices[j] < stockPrices[i]) {
                // if J is less than I, sell I
                sumProfit += stockPrices[i] - lowestPrice;
                //stockOwned = false;
                lowestPrice = stockPrices[j];
                // or we dont sell it
            } else if (j+1 == stockPrices.length) {
                sumProfit += stockPrices[j] - lowestPrice;
            } else {
                // do nothing
            }
            i++;
            j++;
        }
        if (sumProfit == 0) {
            // check to see if we can sell
            System.out.println("lowestPrice: " + lowestPrice);
            System.out.println("I and J : " + i + " " + j);

            if ( lowestPrice == stockPrices[0] ){
                sumProfit += stockPrices[stockPrices.length-1] - lowestPrice;
            }
        }
        return sumProfit;
    }
    
}