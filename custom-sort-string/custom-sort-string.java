class Solution {
    public String customSortString(String S, String T) {
        // count[char] = the number of occurrences of 'char' in T.
        // This is offset so that count[0] = occurrences of 'a', etc.
        // 'count' represents the current state of characters
        // (with multiplicity) we need to write to our answer.
        int[] count = new int[26];
        for (char c: T.toCharArray())
            count[c - 'a']++;

        // ans will be our final answer.  We use StringBuilder to join
        // the answer so that we more efficiently calculate a
        // concatenation of strings.
        StringBuilder ans = new StringBuilder();

        // Write all characters that occur in S, in the order of S.
        for (char c: S.toCharArray()) {
            for (int i = 0; i < count[c - 'a']; ++i)
                ans.append(c);
            // Setting count[char] to zero to denote that we do
            // not need to write 'char' into our answer anymore.
            count[c - 'a'] = 0;
        }

        // Write all remaining characters that don't occur in S.
        // That information is specified by 'count'.
        for (char c = 'a'; c <= 'z'; ++c)
            for (int i = 0; i < count[c - 'a']; ++i)
                ans.append(c);

        return ans.toString();
    }
}


// 作者：LeetCode
// 链接：https://leetcode-cn.com/problems/custom-sort-string/solution/zi-ding-yi-zi-fu-chuan-pai-xu-by-leetcode/
// 来源：力扣（LeetCode）
// 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。