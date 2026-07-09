import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < progresses.length; i++) {
            int days = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            queue.offer(days);
        }

        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            int standard = queue.poll();
            int count = 1;

            while (!queue.isEmpty() && queue.peek() <= standard) {
                queue.poll();
                count++;
            }

            list.add(count);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}