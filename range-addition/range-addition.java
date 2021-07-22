class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] ans = new int[length];
        for(int[] update:updates){
            // ans[update[0]] = update[2] + ans[update[0] - 1];
            // if (update[1] < length) {
            //     ans[update[1]] = ans[update[1]] - update[2];
            // }
            for(int i = update[0];i<=update[1];i++){
                ans[i] += update[2];
            }
        }
        // for(int i =1;i<length;i++) {
        //     ans[i] =  ans[i] + ans[i-1];
        // }
        return ans;
    }
}