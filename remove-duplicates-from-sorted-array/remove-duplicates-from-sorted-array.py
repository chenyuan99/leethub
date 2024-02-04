class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        # length is one, no duplicates
        if len(nums) == 1: return 1
        counter = 1
        # prev = nums[0]
        left = 0
        right = 1
        while right <= len(nums)-1:
            if nums[left] == nums[right]: 
                right+=1 # left 0, right 2. counter 1
            else:
                counter+=1
                left = right
                right+=1 # left 2, right 3. counter 2
                nums[counter-1] = nums[left]
        return counter