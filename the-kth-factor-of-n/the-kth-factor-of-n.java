class Solution {
    public int kthFactor(int n, int k) {
          int[] dp = new int[k];
        int index = 0;
        Arrays.fill(dp, -1);
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && index < k) {
                dp[index] = i;
                index++;
            }
            if (index > k) {
                break;
            }
        }
        return dp[k - 1];
        
    }
}