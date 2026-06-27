import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[index]) {
                index = i;
            }
        }
        Arrays.sort(array);
        int[] answer = new int[2];
        answer[0] = array[array.length - 1];
        answer[1] = index;
        return answer;
    }
}
