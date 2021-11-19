class Solution {
    public boolean isHappy(int n) {
        List<Integer> v = new ArrayList<>();
        return recursion(n,v);
        
    }
    
    public boolean recursion(int n, List<Integer> visited){
        if(n==1)return true;
        if(visited.contains(n)) return false;
        int res = 0;
        visited.add(n);
        while(n!=0){
            res = res + (n%10)* (n%10);
            // System.out.println(res);
            n = n/10 ;
        }
        // System.out.println(res);
        return recursion(res,visited);
    }
}