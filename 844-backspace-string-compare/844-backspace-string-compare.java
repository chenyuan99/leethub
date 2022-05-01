class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        for(Character c: s.toCharArray()){
            if(c.equals('#')){
                if(sStack.size()>0)sStack.pop();
            }
            else sStack.push(c);
        }
        for(Character c: t.toCharArray()){
            if(c.equals('#')){
                if(tStack.size()>0)tStack.pop();
            }
            else tStack.push(c);
        }
        
        return sStack.toString().equals(tStack.toString());
    }
}