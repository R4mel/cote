import java.util.*;

class Solution {
    public long solution(long n) {
        char[] c = String.valueOf(n).toCharArray();
        Arrays.sort(c);
        return Long.parseLong(new StringBuilder(new String(c))
                .reverse()
                .toString());
    }
}