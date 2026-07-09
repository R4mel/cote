import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for (int x : ingredient) {
            list.add(x);

            int size = list.size();

            if (size >= 4
                    && list.get(size - 4) == 1
                    && list.get(size - 3) == 2
                    && list.get(size - 2) == 3
                    && list.get(size - 1) == 1) {

                for (int i = 0; i < 4; i++) {
                    list.remove(list.size() - 1);
                }

                answer++;
            }
        }

        return answer;
    }
}