class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // int left = 0;
        // int right = 1;
        int n = temperatures.length;
        int[] res = new int[n];
        for(int left = 0;left<n-1;left++){
            // int right = left + 1;
            for(int right = left + 1;right<n;right++){
                if(temperatures[right]<=temperatures[left]){
                    if(right == n-1){
                        res[left] = 0;
                        break;
                    }
                    continue;
                }
                else {
                    res[left] = right - left;
                    break;
                }
            }
        }
        res[n-1] = 0;
        return res;
    }
}