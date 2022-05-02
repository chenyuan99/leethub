class Solution:
    def reorderLogFiles(self, logs: List[str]) -> List[str]:
        def trans(log: str) -> tuple:
            a, b = log.split(' ', 1)
            return (0, b, a) if b[0].isalpha() else (1,)

        logs.sort(key=trans)  # sort 是稳定排序
        return logs

# 作者：LeetCode-Solution
# 链接：https://leetcode.cn/problems/reorder-data-in-log-files/solution/zhong-xin-pai-lie-ri-zhi-wen-jian-by-lee-egtm/
# 来源：力扣（LeetCode）
# 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。