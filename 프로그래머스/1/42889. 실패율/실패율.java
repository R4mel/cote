import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        int[] count = new int[N + 2];

        for (int stage : stages) {
            count[stage]++;
        }

        Map<Integer, Double> map = new HashMap<>();

        int remain = stages.length;

        for (int i = 1; i <= N; i++) {
            if (remain == 0) {
                map.put(i, 0.0);
            } else {
                map.put(i, (double) count[i] / remain);
            }

            remain -= count[i];
        }

        List<Map.Entry<Integer, Double>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> {
            int cmp = Double.compare(b.getValue(), a.getValue());

            if (cmp == 0) {
                return Integer.compare(a.getKey(), b.getKey());
            }

            return cmp;
        });

        for (int i = 0; i < N; i++) {
            answer[i] = list.get(i).getKey();
        }

        return answer;
    }
}