class Solution:
    def findMinDifference(self, timePoints: List[str]) -> int:
        # 根据题意，总共只有24*60=1440种组合，如果超过1440，必然有两个时间相同
        if len(timePoints) > 1440:
            return 0

        # 将时间排序
        timePoints.sort()
        # 记录下最小的时间
        t0 = self.get_minutes(timePoints[0])
        last = t0
        result = float("inf")
        # 计算任意两个相邻的时间，并更新最小时间差
        for time_point in timePoints[1:]:
            minute = self.get_minutes(time_point)
            result = min(result, minute - last)
            last = minute
        # 计算首尾两个时间的差值
        result = min(result, t0 + 1440 - last)
        return result 
        
    @classmethod
    def get_minutes(cls, t: str):
        """ 将时间转换为分钟 """
        return int(t[:2]) * 60 + int(t[-2:])


# 作者：larrychen__
# 链接：https://leetcode.cn/problems/minimum-time-difference/solution/539-zui-xiao-shi-jian-chai-by-larrychen_-uck9/
# 来源：力扣（LeetCode）
# 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。