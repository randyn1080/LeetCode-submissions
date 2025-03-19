class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> myList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            if (i%3==0) {
                sb.append("Fizz");
            } 
            if (i%5==0) {
                sb.append("Buzz");
            }
            if (sb.toString().equals("")) {
                sb.append(i);
            }
            System.out.println(sb.toString());
            myList.add(sb.toString());
        }
        return myList;
    }
}