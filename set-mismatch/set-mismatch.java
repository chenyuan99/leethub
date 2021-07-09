class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> dict = new HashMap<>();
        Arrays.sort(nums);
        int[] ans = new int[2];        
        for(int i = 0;i<nums.length;i++){
            int temp = nums[i];
           if(! dict.containsKey(temp)){
               dict.put(temp,1);
           }else{
               dict.put(temp,dict.get(temp)+1);
               ans[0] = temp;
           }
           if(!dict.containsKey(i+1)) ans[1] = i+1;
        }

        //  for(int i = 0;i<nums.length;i++){
        //      int temp = nums[i];
        //     if(!dict.containsKey(i+1)) ans[1] = i+1;

        //  }

        return ans;
    }
}