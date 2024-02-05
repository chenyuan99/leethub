class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        pre = 0
        mp = {}
        mp[0] = 1
        for i in range(len(nums)):
            pre+=nums[i]
            if (pre - k) in mp.keys() : 
                count+=mp.get(pre-k)
            mp[pre] = mp.get(pre,0)+1
        return count