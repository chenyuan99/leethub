class Solution {
    public int minAddToMakeValid(String s) {
        int counter = 0;
        int n = s.length();
        int[] dp = new int[n];
        PriorityQueue<Character> pqLeft = new PriorityQueue<>();
        PriorityQueue<Character> pqRight = new PriorityQueue<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='(') pqLeft.add(s.charAt(i));
            else if(s.charAt(i)==')') {
                if(pqLeft.isEmpty())pqRight.add(s.charAt(i));
                else pqLeft.remove('(');
            }
        }

        return pqRight.size() + pqLeft.size();

    }
}