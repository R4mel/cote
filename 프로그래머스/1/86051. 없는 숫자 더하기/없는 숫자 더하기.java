import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (numbers[i] == a[j]) {
                    a[j] = 0;
                    break;
                }
            }
        }
        return Arrays.stream(a).sum();
    }
}