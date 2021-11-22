class Solution {
 public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for(int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);
        
        int res = 0;
        if(k == 0){
            for(int i : map.values())
            if(i > 1) res++;
        }else{
            for(int i : map.keySet())
            if(map.containsKey(i + k)) res++;
        }

        return res;
    }

// 作者：feilue
// 链接：https://leetcode-cn.com/problems/k-diff-pairs-in-an-array/solution/java-hashmap-by-feilue-jg3z/
// 来源：力扣（LeetCode）
// 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}