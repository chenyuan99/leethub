class Solution(object):
    def findTheWinner(self, n, k):
        pos = 0
        for i in range(2, n + 1):
            pos = (pos + k) % i
        return pos + 1

# 作者：fuxuemingzhu
# 链接：https://leetcode.cn/problems/find-the-winner-of-the-circular-game/solution/by-fuxuemingzhu-laof/
# 来源：力扣（LeetCode）
# 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。