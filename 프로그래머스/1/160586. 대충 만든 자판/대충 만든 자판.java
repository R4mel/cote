import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();

        for (String k : keymap) {
            char[] c = k.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (!map.containsKey(c[i])) {
                    map.put(c[i], i + 1);
                } else {
                    map.put(c[i], Math.min(map.get(c[i]), i + 1));
                }
            }
        }

        // for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        // System.out.println(entry.getKey() + " " + entry.getValue());
        // }

        int ii = 0;
        for (String t : targets) {
            char[] c = t.toCharArray();
            int count = 0;
            for (int i = 0; i < c.length; i++) {
                if (!map.containsKey(c[i])) {
                    count = -1;
                    break;
                }
                count += map.get(c[i]);
            }
            answer[ii++] = count;
        }

        return answer;
    }
}