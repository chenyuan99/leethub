class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(nums[n-1]!=n)return n;
        for(int i =0;i<=n;i++){
            if(nums[i]!=i)return i;
        }
        
        return -1;
    }
}