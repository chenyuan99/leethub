class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        peak = max(nums)
        return nums.index(peak)
        