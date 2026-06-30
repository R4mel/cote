import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i : arr) {
            if (stack.isEmpty() || stack.peekLast() != i) {
                stack.addLast(i);
            }
        }

        int[] answer = new int[stack.size()];
        int i = 0;
        for (int ii : stack) {
            answer[i++] = ii;
        }
        return answer;
    }
}