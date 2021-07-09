class Solution {
    public int findMin(int[] nums) {
        int[] newNums = nums;
        Arrays.sort(newNums);
        return newNums[0];
    }
}