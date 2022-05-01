class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int counter = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == target) {
                if(counter == 0) ans[0] = i;
                counter++;
            }
        }
        if (counter > 0)ans[1] = ans[0] + counter - 1;
        return ans;
    }
}