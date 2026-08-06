import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Deque<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < prices.length; i++) {
            queue.offer(new int[] { i, prices[i] });
        }
        int[] answer = new int[prices.length];

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int time = 0;
            for (int[] p : queue) {
                time++;
                if (p[1] < current[1]) {
                    break;
                }
            }
            answer[current[0]] = time;
        }
        return answer;
    }
}