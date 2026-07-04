import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                for (String s : map.keySet()) {
                    if (photo[i][j].equals(s)) {
                        sum += map.get(s);
                    }
                }
            }
            answer[i] = sum;
        }

        return answer;
    }
}