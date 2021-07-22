class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        // 思路2
        int[] covered = new int[52];
        for(int[] r : ranges) {
            covered[r[0]]++;
            covered[r[1] + 1]--;
        }

        // 这里更新数组 如果没有被覆盖到的位置更新完以后还会是0
        for(int i = 1; i < 52; i++) {
            covered[i] += covered[i - 1];
        }

        // 最后判断
        for(int i = left; i <= right; i++) {
            if(covered[i] == 0) return false;
        }

        return true;
    }
}

// 作者：chi-mai
// 链接：https://leetcode-cn.com/problems/check-if-all-the-integers-in-a-range-are-covered/solution/javaliang-chong-si-lu-by-chi-mai-74iz/
// 来源：力扣（LeetCode）
// 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。