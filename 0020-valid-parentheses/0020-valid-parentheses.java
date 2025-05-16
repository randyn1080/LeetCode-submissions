class Solution {
    public boolean isValid(String s) {
        Deque<Character> charStack = new ArrayDeque<>();

        for (Character c : s.toCharArray()){
            if (charStack.isEmpty()) {
                // push current onto it
                charStack.push(c);
            } else if (c == '{' || c == '[' || c == '('){
                // if it's not empty, but c is an open bracket, we can push
                charStack.push(c);
            } else { // c is a closing bracket, the top must be it's complement.
                char topOfStack = charStack.peek();
                if (c == '}' && topOfStack == '{' ||
                    c == ']' && topOfStack == '[' ||
                    c == ')' && topOfStack == '(') {
                    
                    charStack.pop();
                } else {
                    return false;
                }
            }
        }

        return charStack.isEmpty();
    }
}