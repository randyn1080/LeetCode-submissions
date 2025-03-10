class RandomizedSet {
    // maintain a map with the integer and the position in the listArr
    private final Map<Integer, Integer> myMap;
    private final List<Integer> myList;

    public RandomizedSet() {
        this.myMap = new HashMap<Integer, Integer>();
        this.myList = new ArrayList<Integer>();
    }
    
    public boolean insert(int val) {
        if(myMap.containsKey(val)) {
            return false;
        } else {
            myMap.put(val, myList.size());
            myList.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(myMap.containsKey(val)) {
            
            // remove it
            // get the index
            int index = myMap.get(val);
            // overwrite val at index with last val in array
            myList.set(index, myList.get(myList.size()-1));
            // change id of the last position id to index
            myMap.put(myList.get(index), index);
            // remove duplicate at end of array
            myList.remove(myList.size()-1);
            // remove the val from map
            myMap.remove(val);

            return true;
        } else {
            return false;
        }
    }
    
    public int getRandom() {;
        Random rand = new Random();
        return myList.get(rand.nextInt(myList.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */