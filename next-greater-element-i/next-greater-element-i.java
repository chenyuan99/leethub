class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // for(int i = 0;i <num2.)
        int n  = nums2.length;
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = n-1;i >=0;i--){
            while(!stack.isEmpty() && nums2[i]>=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                map.put(nums2[i],-1);
            }else{
                map.put(nums2[i],stack.peek());
            }
            stack.push(nums2[i]);
        }
        int[] res = new int[nums1.length];
        for(int i = 0;i<nums1.length;i++){
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}