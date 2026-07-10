import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Deque<Integer> stack = new ArrayDeque<>();

        int n = board.length;
        int answer = 0;
        for (int m : moves) {
            int tmp = -1;
            for (int i = 0; i < n; i++) {
                if (board[i][m - 1] != 0) {
                    tmp = board[i][m - 1];
                    board[i][m - 1] = 0;
                    break;
                }
            }
            if (tmp != -1) {
                if (!stack.isEmpty() && tmp == stack.peek()) {
                    stack.pop();
                    answer += 2;
                } else {
                    stack.push(tmp);
                }
            }
        }

        return answer;
    }
}
