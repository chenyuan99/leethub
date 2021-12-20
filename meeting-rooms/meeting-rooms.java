class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
         Arrays.sort(intervals, (i1,i2)->i1[0] - i2[0]);
        for(int i =0; i <intervals.length-1;i++){
            if(intervals[i][1] > intervals[i+1][0]){
                return false;
            }
        }
        return true;
    }
}