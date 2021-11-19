class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 2* n-1;i>=0;i--){
            while(!stack.isEmpty() && nums[i%n] >= stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i%n] = -1;
            }else{
                res[i%n] = stack.peek();
            }
            stack.push(nums[i%n]);
        }
        return res;
    }
}