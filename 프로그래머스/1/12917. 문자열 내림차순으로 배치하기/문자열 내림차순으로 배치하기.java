import java.util.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}