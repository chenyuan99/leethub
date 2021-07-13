class Solution {
    public int searchInsert(int[] nums, int target) {
        int l =0;
        int r = nums.length-1;
        while(l<=r){
            int m = (r+l)/2;
            if (target == nums[m])return m;
            else if(target < nums[m]){
                r = m - 1;
            }
            else{
                l = m + 1;
            }
        }
        return l;
    }
}