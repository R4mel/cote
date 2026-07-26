import java.util.*;

class Solution {
    boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.addLast(c);
            } else {
                if (!stack.isEmpty() && stack.peekLast() == '(') {
                    stack.pollLast();
                } else {
                    stack.addLast(c);
                }
            }
        }
        return stack.size() == 0;
    }
}