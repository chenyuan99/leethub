class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        helper(res, new ArrayList<>(),nums,0);
        return res;
    }

    public void helper(List<List<Integer>> res, List<Integer> level, int[] nums, int index){
        res.add(new ArrayList<>(level));
        for(int i = index;i<nums.length;i++){
            if(i!=index&&nums[i] == nums[i-1]){
                continue;
            }
            level.add(nums[i]);
            helper(res,level,nums,i+1);
            level.remove(level.size()-1);
        }
    }
}