class Solution {
    public boolean isValid(String s) {
        Stack<Character> parenthesesStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            // check for ()[]{}
            // push onto stack if ({[
            if (s.charAt(i) == '(' ||
                s.charAt(i) == '[' ||
                s.charAt(i) == '{') {
                
                parenthesesStack.push(s.charAt(i));
            }
            else if (parenthesesStack.isEmpty() &&
                    (s.charAt(i) == ')' ||
                    s.charAt(i) == '}' ||
                    s.charAt(i) == ']')) {
                
                return false;
            }
            else if (s.charAt(i) == ')' &&
                    parenthesesStack.peek() == '(') {
                parenthesesStack.pop();
            }
            else if (s.charAt(i) == '}' &&
                    parenthesesStack.peek() == '{') {
                parenthesesStack.pop();
            }
            else if (s.charAt(i) == ']' &&
                    parenthesesStack.peek() == '[') {
                parenthesesStack.pop();
            } else {
                parenthesesStack.push(s.charAt(i));
            }
        }

        return parenthesesStack.isEmpty();

    }
}