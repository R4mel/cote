import java.util.*;

class Solution {
    public boolean solution(int x) {
        String[] c = String.valueOf(x).split("");
        int sum = Arrays.stream(c).mapToInt(Integer::parseInt).sum();
        return x % sum == 0;
    }
}