import java.util.*;

class Solution {
    public int solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.addLast(c);
            } else {
                if (stack.peekLast() == c) {
                    stack.pollLast();
                } else {
                    stack.addLast(c);
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}