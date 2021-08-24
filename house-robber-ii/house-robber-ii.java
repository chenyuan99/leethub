class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n<=1) return nums[n-1];
        int res1 = helper(nums,0,n-2);
        int res2 = helper(nums,1,n-1);
        return Math.max(res1,res2);
    }

    private int helper(int[] nums, int start, int end){
        int n = end - start + 1;
        if(n<=1) return nums[start];
        int[] dp = new int[n];
        dp[0] = nums[start];
        dp[1] = nums[start+1];
        int peak = 0;
         for(int i = 2; i < n;i++){
            peak = Math.max(dp[i-2],peak);
            dp[i] = Math.max(peak + nums[start+i],dp[i-1]);

        }
        return Math.max(dp[n-1],dp[n-2]);
    }
}