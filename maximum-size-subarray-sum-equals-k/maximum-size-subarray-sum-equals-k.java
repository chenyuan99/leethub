class Solution {
        public int maxSubArrayLen(int[] nums, int k) {
    //哈希表存储值和下标
    int n=nums.length;
    Map<Integer,Integer> map=new HashMap<>();
    int[]pre=new int[n+1];
    for(int i=1;i<=n;i++){
        pre[i]=pre[i-1]+nums[i-1];
    }
    map.put(0,0);
     int max=Integer.MIN_VALUE;
    for(int i=1;i<=n;i++){
    if(map.containsKey(pre[i]-k)){
        max=Math.max(max,i-map.get(pre[i]-k));
    }
    if(!map.containsKey(pre[i])){
        map.put(pre[i],i);
    }else{

    }
    
    }
return max==Integer.MIN_VALUE?0:max;
    }

// 作者：weiwo20010101
// 链接：https://leetcode-cn.com/problems/maximum-size-subarray-sum-equals-k/solution/java-he-wei-kde-zui-chang-zi-shu-zu-by-x-ongk/
// 来源：力扣（LeetCode）
// 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}