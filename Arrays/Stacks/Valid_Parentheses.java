import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack1 = new Stack<>();
        boolean bool = true;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (bool) {
                if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                    stack1.push(currentChar);
                } else {
                    if (stack1.isEmpty()) {
                        return bool = false;  // Unmatched closing bracket, return false
                    }

                    char top = stack1.pop();

                    if ((currentChar == ')' && top != '(') ||
                        (currentChar == ']' && top != '[') ||
                        (currentChar == '}' && top != '{')) {
                        return bool = false;  // Mismatched closing bracket, return false
                    }
                }

                if (i == s.length() - 1 && stack1.isEmpty()) {
                    return bool = true;
                }
            } else {
                break;
            }
        }

        return bool;
    }
}
