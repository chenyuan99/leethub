class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        if len(nums) == 1:
            return [nums]
        else:
            tmp = nums[:-1]
            res = nums[-1]
            d = self.permute(tmp)
            ans = []
            for x in d:
                for i in range(len(x)+1):
                    m = x[:i]
                    m.append(res)
                    n = x[i:]
                    m.extend(n)
                    ans.append(m)
            return ans