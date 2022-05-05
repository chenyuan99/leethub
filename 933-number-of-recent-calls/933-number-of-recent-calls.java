class RecentCounter {
    Queue<Integer> queue;

    public RecentCounter() {
        queue = new ArrayDeque<Integer>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}

// 作者：LeetCode-Solution
// 链接：https://leetcode.cn/problems/number-of-recent-calls/solution/zui-jin-de-qing-qiu-ci-shu-by-leetcode-s-ncm1/
// 来源：力扣（LeetCode）
// 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。