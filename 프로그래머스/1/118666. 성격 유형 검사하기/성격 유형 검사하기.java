import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        int[] scores = new int[] { -3, -2, -1, 0, 1, 2, 3 };
        Map<String, Integer> map = new HashMap<>();
        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);

        for (int i = 0; i < survey.length; i++) {
            String start = survey[i].substring(0, 1);
            String end = survey[i].substring(1);

            int score = scores[choices[i] - 1];

            if (score < 0) {
                map.put(start, map.get(start) + Math.abs(score));
            } else {
                map.put(end, map.get(end) + score);
            }
        }

        String[] s = new String[] { "RT", "CF", "JM", "AN" };
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            String s1 = s[i].substring(0, 1);
            String s2 = s[i].substring(1);

            int a = map.get(s1);
            int b = map.get(s2);

            if (a > b) {
                sb.append(s1);
            } else if (a < b) {
                sb.append(s2);
            } else {
                if (s1.compareTo(s2) < 0) {
                    sb.append(s1);
                } else {
                    sb.append(s2);
                }
            }
        }
        return sb.toString();
    }
}