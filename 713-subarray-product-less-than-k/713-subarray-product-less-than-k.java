class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int l = 0, r = 0, base = 1, ans = 0;
        int length = nums.length;
        while (r < length) {
            base *= nums[r++];
            while (base >= k) base /= nums[l++];
            ans += r - l;
        }
        return ans;
    }
}