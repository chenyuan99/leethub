class Solution {
    int[] head;
    int[] to;
    int[] edge;
    int[] next;
    int idx = 0;

    void add(int a, int b, int w) {
        to[idx] = b;
        edge[idx] = w;
        next[idx] = head[a];
        head[a] = idx++;
    }
    public int minimumCost(int n, int[][] connections) {
        head = new int[n + 1];
        int m = connections.length * 2;
        to = new int[m];
        edge = new int[m];
        next = new int[m];
        Arrays.fill(head, -1);
        for (int[] connection : connections) {
            add(connection[0], connection[1], connection[2]);
            add(connection[1], connection[0], connection[2]);
        }

        // 初始化visited、priority queue
        final HashSet<Integer> visited = new HashSet<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        // [city, cost]
        pq.add(new int[]{1, 0});

        int res = 0;
        // prim
        while (!pq.isEmpty() && visited.size() < n) {
            final int[] poll = pq.poll();
            if (visited.contains(poll[0])) {
                continue;
            }
            visited.add(poll[0]);
            res += poll[1];
            for (int i = head[poll[0]]; i != -1; i = next[i]) {
                pq.add(new int[]{to[i], edge[i]});
            }
        }
        if (visited.size() != n) {
            return -1;
        }
        return res;
        
    }
}