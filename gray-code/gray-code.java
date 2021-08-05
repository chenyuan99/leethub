class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        gcHelper(n,ans);
        return ans;
    }
    
    private void gcHelper(int n, List<Integer> ans){
        if(n == 0){ 
            ans.add(0) ;
            return;
        }
        gcHelper(n-1,ans);
        int size = ans.size();
        int k = 1 << (n - 1);
        for(int i= size-1;i>=0;i--){
            ans.add(ans.get(i)+k);
        }
    }
}