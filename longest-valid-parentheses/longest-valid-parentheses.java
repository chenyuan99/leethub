class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max =0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }else{
                stack.pop();

                if(!stack.isEmpty()){
                    max = Math.max(max,i-stack.peek());
                }
                else{
                    stack.push(i);
                }
            }
        }

        return max;
    }
}