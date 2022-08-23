class Solution:
    def minSteps(self, s: str, t: str) -> int:
        s_cnt = collections.Counter(s)
        t_cnt = collections.Counter(t)
        ans = 0
        for c in set(s_cnt.keys()).union(set(t_cnt.keys())):
            if s_cnt[c] < t_cnt[c]:
                ans += t_cnt[c] - s_cnt[c]
        return ans

# 作者：LeetCode-Solution
# 链接：https://leetcode.cn/problems/minimum-number-of-steps-to-make-two-strings-anagram/solution/zhi-zao-zi-mu-yi-wei-ci-de-zui-xiao-bu-zou-shu-by-/
# 来源：力扣（LeetCode）
# 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。