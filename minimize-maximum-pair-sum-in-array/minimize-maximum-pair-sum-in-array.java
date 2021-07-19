class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        // return nums[0] + nums[nums.length-1];
        int[] sums = new int[nums.length/2];
        int max = 0;
        for(int i = 0;i<nums.length/2;i++){
            sums[i] = nums[i] + nums[nums.length-1-i];
            max = Math.max(sums[i],max);
        }
        return max;
    }
}