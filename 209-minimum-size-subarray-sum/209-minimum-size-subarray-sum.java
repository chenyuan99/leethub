class Solution {
    public int minSubArrayLen(int target, int[] A) {
        int left = 0, N = A.length, res = Integer.MAX_VALUE, sum = 0;
        for(int i = 0;i<N;i++){
            sum += A[i];
            while(sum >= target){
                res = Math.min(res,i-left+1);
                sum -= A[left++];
            }
        }
        return res == Integer.MAX_VALUE?0:res;
    }
}