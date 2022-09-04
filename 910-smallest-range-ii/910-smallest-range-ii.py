class Solution:
    def smallestRangeII(self, nums: List[int], k: int) -> int:
        n = len(nums)
        res = inf
        nums.sort()
        res = nums[-1] - nums[0] # 所有人都要失去或者得到钱得情况
        for i in range(n-1):
            rich = max(nums[-1]-k, nums[i]+k)
            poor = min(nums[i+1]-k, nums[0]+k)
            res = min(res, rich-poor)
        return res

# 作者：GG_boy
# 链接：https://leetcode.cn/problems/smallest-range-ii/solution/by-gg_boy-vnio/
# 来源：力扣（LeetCode）
# 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。