class Solution {
    public boolean isValid(String s) {
        boolean left1 = true;
        boolean left2 = true;
        boolean left3 = true;
        char c;
        Stack<Character> stack = new Stack<Character>();
         for (int i = 0; i < s.length(); i++) {
             c = s.charAt(i);
            if (c== '(' ){
                left1 = false;
                stack.push(c);
            }
            if (c == '[' ){
                left2 = false;
                stack.push(c);
            }
            if (c == '{' ){
                left3 = false;
                stack.push(c);
            }
            if (c == ')' ){
                if (stack.isEmpty()){
                    return false;
                }
                if (stack.pop() != '('){
                    return false;
                }
                left1 = true;
            }
            if (c == ']' ){
                if (stack.isEmpty()){
                    return false;
                }
                if (stack.pop() != '['){
                    return false;
                }
                left2 = true;
            }
            if (c == '}' ){
                if (stack.isEmpty()){
                    return false;
                }
                if (stack.pop() != '{'){
                    return false;
                }
                left3 = true;
            }
        }
        return stack.isEmpty();

    }
}