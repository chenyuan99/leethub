public class Solution {
    public int shortestDistance(int[][] grid) {

        //This is a bfs solution, bfs needs queue generally.

        int row = grid.length;
        if(row == 0) return -1;
        int col  = grid[0].length;
        if(col == 0) return -1;

        int buildingNums = 0;

        int[][] dis = new int[row][col]; // distance sum of all bulding to dis[x][y];
        int[][] num = new int[row][col]; // how many buildings can reach num[x][y]

        for(int i=0 ; i< row; i++){
            for(int j = 0; j< col; j++){
                if(grid[i][j] == 1){
                    buildingNums++;
                    bfs(grid, dis, num, i, j);
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == 0 && dis[i][j] != 0 && num[i][j] == buildingNums){
                    min = Math.min(min, dis[i][j]);
                }
            }
        }
        if(min < Integer.MAX_VALUE) return min;
        return -1;
    }

    private void bfs(int[][] grid, int[][] dis, int[][] num, int x, int y){
        int row = grid.length;
        int col = grid[0].length;
        int[][] neighbor = {{1,0},{-1,0},{0,1},{0,-1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});

        boolean[][] visited = new boolean[row][col];
        int dist = 0;
        while(!queue.isEmpty()){
            dist++;
            int size = queue.size();// all size number of node, their neigbors belongs to next dist, which for distance.
            for(int i=0 ; i<size; i++){
                int[] top = queue.poll();
                for(int j=0; j< 4;j++){
                    int k = top[0] + neighbor[j][0];
                    int l = top[1] + neighbor[j][1];
                    if(k>=0 && k< row && l >= 0 && l < col && grid[k][l] == 0 && !visited[k][l]){
                        visited[k][l] = true;
                        dis[k][l] += dist;
                        num[k][l]++;
                        queue.add(new int[]{k,l});
                    }
                }
            }
        }

    }
}