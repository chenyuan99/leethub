class Solution:
    def findMissingRanges(self, nums: List[int], lower: int, upper: int) -> List[List[int]]:
        nums = [lower - 1] + nums + [upper + 1]
        res = []
        
        for idx in range(1, len(nums)):
            if nums[idx] > nums[idx-1] + 1:
                res.append([nums[idx-1] + 1, nums[idx] - 1])
        return res
            