import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        final int[] a1 = new int[] { 1, 2, 3, 4, 5 };
        final int[] a2 = new int[] { 2, 1, 2, 3, 2, 4, 2, 5 };
        final int[] a3 = new int[] { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        for (int i = 0; i < answers.length; i++) {
            if (a1[i % a1.length] == answers[i]) {
                c1++;
            }
            if (a2[i % a2.length] == answers[i]) {
                c2++;
            }
            if (a3[i % a3.length] == answers[i]) {
                c3++;
            }
        }

        int max = Math.max(c1, Math.max(c2, c3));
        List<Integer> list = new ArrayList<>();
        if (c1 == max) {
            list.add(1);
        }
        if (c2 == max) {
            list.add(2);
        }
        if (c3 == max) {
            list.add(3);
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}