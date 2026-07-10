import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);

        int e = map.get(ext);
        int s = map.get(sort_by);

        List<int[]> list = new ArrayList<>();
        for (int[] d : data) {
            if (d[e] < val_ext)
                list.add(d);
        }

        Collections.sort(list, (o1, o2) -> o1[s] - o2[s]);

        int[][] answer = new int[list.size()][];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}