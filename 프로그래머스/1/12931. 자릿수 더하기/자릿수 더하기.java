import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for (char c : String.valueOf(n).toCharArray()) {
            answer += c - '0';
        }

        return answer;
    }
}