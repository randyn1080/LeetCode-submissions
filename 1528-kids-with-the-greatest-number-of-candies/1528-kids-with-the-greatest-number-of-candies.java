class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> hasGreatestWithExtra = new ArrayList<>();
        int max = getMax(candies);
        for (int i = 0; i < candies.length; i++) {
            hasGreatestWithExtra.add((candies[i] + extraCandies) >= max);
        }
        return hasGreatestWithExtra;
    }

    public int getMax(int[] candies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(candies[i], max);
        }
        return max;
    }
}