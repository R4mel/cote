import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> map = new HashMap<>();

        for (int i = 0; i < report.length; i++) {
            String userId = report[i].split(" ")[0];
            String reportId = report[i].split(" ")[1];

            Set<String> set = map.getOrDefault(userId, new HashSet<>());
            set.add(reportId);
            map.put(userId, set);
        }

        Map<String, Integer> countMap = new HashMap<>();
        for (Set<String> s : map.values()) {
            for (String name : s) {
                countMap.put(name, countMap.getOrDefault(name, 0) + 1);
            }
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            Set<String> s = map.getOrDefault(id_list[i], new HashSet<>());
            for (String name : s) {
                if (countMap.getOrDefault(name, 0) >= k) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}