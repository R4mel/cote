import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1)
            return new int[] { -1 };
        int minIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIdx]) {
                minIdx = i;
            }
        }
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i != minIdx) {
                arr1.add(arr[i]);
            }
        }
        return arr1.stream().mapToInt(Integer::intValue).toArray();
    }
}