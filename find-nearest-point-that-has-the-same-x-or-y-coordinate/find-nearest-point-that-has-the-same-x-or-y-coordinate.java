class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int shortestIndex =-1; // Return -1 if no valid points are found
        int shortestDistance = Integer.MAX_VALUE; //set to default max to compare
        for(int i=0;i<points.length;i++){
            if(points[i][0] == x || points[i][1] == y){
                int dis = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if(dis < shortestDistance){ // set the result ony if you find smaller distance
                    shortestDistance = dis;
                    shortestIndex = i;
                }
            }
        }
        return shortestIndex;
        
    }
}