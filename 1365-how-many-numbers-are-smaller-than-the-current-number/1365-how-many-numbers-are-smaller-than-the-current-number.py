class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        # 初始化hashmap存储，key为数值，value为比该数值小的个数
        # arr排序后，数值的索引即比该数值小的个数
        hashmap, arr = {}, sorted(nums)
        for i in range(len(arr)):
            # 注意，一个值只存第一次出现时的索引
            if arr[i] not in hashmap:
                hashmap[arr[i]] = i
        # 采用map函数将nums中每个值作为hashmap的key,依次返回对应的value
        return list(map(lambda x: hashmap[x], nums))

# 作者：CodeHard_LiveFun
# 链接：https://leetcode.cn/problems/how-many-numbers-are-smaller-than-the-current-number/solution/-by-codehard_livefun-oi7t/
# 来源：力扣（LeetCode）
# 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。