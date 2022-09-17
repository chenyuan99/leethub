class Solution:
    def isSolvable(self, words: List[str], result: str) -> bool:
        _weight = dict()
        _lead_zero = set()
        for word in words:
            for i, ch in enumerate(word[::-1]):
                _weight[ch] = _weight.get(ch, 0) + 10**i
            if len(word) > 1:
                _lead_zero.add(word[0])
        for i, ch in enumerate(result[::-1]):
            _weight[ch] = _weight.get(ch, 0) - 10**i
        if len(result) > 1:
            _lead_zero.add(result[0])
        
        weight = sorted(list(_weight.items()), key=lambda x: -abs(x[1]))
        suffix_sum_min = [0] * len(weight)
        suffix_sum_max = [0] * len(weight)
        for i in range(len(weight)):
            suffix_pos = sorted(x[1] for x in weight[i:] if x[1] > 0)
            suffix_neg = sorted(x[1] for x in weight[i:] if x[1] < 0)
            suffix_sum_min[i] = sum((len(suffix_pos) - 1 - j) * elem for j, elem in enumerate(suffix_pos)) + sum((9 - j) * elem for j, elem in enumerate(suffix_neg))
            suffix_sum_max[i] = sum((10 - len(suffix_pos) + j) * elem for j, elem in enumerate(suffix_pos)) + sum(j * elem for j, elem in enumerate(suffix_neg))
        
        lead_zero = [int(ch in _lead_zero) for (ch, _) in weight]
        used = [0] * 10
        
        def dfs(pos, total):
            if pos == len(weight):
                return total == 0
            if not total + suffix_sum_min[pos] <= 0 <= total + suffix_sum_max[pos]:
                return False
            for i in range(lead_zero[pos], 10):
                if not used[i]:
                    used[i] = True
                    check = dfs(pos + 1, total + weight[pos][1] * i)
                    used[i] = False
                    if check:
                        return True
            return False
        
        return dfs(0, 0)

# 作者：LeetCode-Solution
# 链接：https://leetcode.cn/problems/verbal-arithmetic-puzzle/solution/suan-nan-ti-by-leetcode-solution/
# 来源：力扣（LeetCode）
# 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。