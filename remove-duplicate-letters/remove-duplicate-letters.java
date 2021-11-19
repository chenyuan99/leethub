class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Integer> stack = new Stack<>();
        int[] last = new int[128];
        Set<Integer> visited = new HashSet<>();
        for(int i = 0;i<s.length();i++) last[s.charAt(i)] = i;
        for(int i = 0;i<s.length();i++){
            int c = s.charAt(i);
            if(!visited.add(c))continue;
            while(!stack.isEmpty() && c<  stack.peek() && i <last[stack.peek()]){
                visited.remove(stack.pop());
            }
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        for(int i : stack)sb.append((char)(i));
        return sb.toString();

    }
}