class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n<=1) return nums[n-1];
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = nums[1];
        int peak = 0;
         for(int i = 2; i < n;i++){
            peak = Math.max(dp[i-2],peak);
            dp[i] = Math.max(peak + nums[i],dp[i-1]);

        }
        return Math.max(dp[n-1],dp[n-2]);
    }
}