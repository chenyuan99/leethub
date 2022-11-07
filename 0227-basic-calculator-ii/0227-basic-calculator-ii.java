

class Solution {
    
    int i = 0 ;
    
    public int calculate(String s) {
        
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        char operator = '+';
        int num = 0;
        
        while(i<s.length()){
            char ch = s.charAt(i++);
            if (ch >= '0' && ch <= '9') num = num * 10 + (ch - '0');
        
        
        if (ch == '(') num = calculate(s);
        if (i >= s.length() || ch == '+'|| ch == '-'|| ch == '*'|| ch == '/'){
            
            if (operator == '+') stack.push(num);
            else if (operator == '-') stack.push(-num);
             else if (operator == '*') stack.push(stack.pop()*num);
            else if (operator == '/') stack.push(stack.pop()/num);
            
            operator = ch;
            num = 0;
        }
        
        
        if (ch==')')break;
        }

        System.out.println(stack);
        int ans = 0;
        while(stack.size() != 0 ){
            ans += stack.pop();
        }
        
        
        return ans;
        
    }
}