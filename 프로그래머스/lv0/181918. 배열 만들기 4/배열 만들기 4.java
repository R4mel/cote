import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        var answer = new ArrayList<Integer>();
        int i = 0;
        while (i < arr.length) {
            if (answer.size() == 0) {
                answer.add(arr[i++]);
            } else if (answer.size() != 0 && answer.get(answer.size() - 1) < arr[i]) {
                answer.add(arr[i++]);
            } else if (answer.size() != 0 && answer.get(answer.size() - 1) >= arr[i]) {
                answer.remove(answer.size() - 1);
            }
        }
        return answer.stream().mapToInt(j -> j).toArray();
    }
}