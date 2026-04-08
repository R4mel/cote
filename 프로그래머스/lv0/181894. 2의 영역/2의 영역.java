import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int firstIndex = 0, lastIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                lastIndex = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                firstIndex = i;
                break;
            }
        }

        if (firstIndex == lastIndex && firstIndex == 0) {
            return new int[]{-1};
        }
        
        for (int i = firstIndex; i <= lastIndex; i++) {
            list.add(arr[i]);
        }

        return list.stream().mapToInt(x -> x).toArray();
    }
}