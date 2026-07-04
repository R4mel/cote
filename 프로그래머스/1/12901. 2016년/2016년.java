import java.util.*;

class Solution {
    public String solution(int a, int b) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "FRI");
        map.put(1, "SAT");
        map.put(2, "SUN");
        map.put(3, "MON");
        map.put(4, "TUE");
        map.put(5, "WED");
        map.put(6, "THU");

        int[] days = new int[] { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int day = 0;
        for (int i = 0; i < a - 1; i++) {
            day += days[i];
        }
        day += b - 1;

        return map.get(day % 7);
    }
}