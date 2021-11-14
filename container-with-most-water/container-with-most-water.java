class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length-1;
        int max = 0;
        while (low < high){
            if (height[low] <= height[high]){
                int area = height[low] *(high - low);
                if (area > max) {max = area;}
                else{low++;}
            }
            else{
                int area = height[high] *(high - low);
                if (area > max){ max = area;}
                else{high--;}
            }
            // low++;
            // high--;
        }

        return max;

    }
}