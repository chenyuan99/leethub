class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        if(length==0) return new int[length];
        int[] ans = new int[length];
        for(int[] update : updates){
            int start = update[0];
            int end = update[1];
            int add = update[2];
            if(start >= 0)  ans[start] += add;
            if(end < length-1)  ans[end+1] -= add;   
        }
        for(int i = 0; i < length;i++){
           if(i != 0) ans[i] = ans[i] + ans[i-1];
        }
        return ans;
    }
}

// 作者：LaoGanMaIsEverything
// 链接：https://leetcode-cn.com/problems/range-addition/solution/9938hen-jian-dan-by-laoganmaiseverything-x0jb/
// 来源：力扣（LeetCode）
// 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。