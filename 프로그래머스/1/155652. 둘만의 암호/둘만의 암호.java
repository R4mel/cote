import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        Set<Character> skipSet = new HashSet<>();
        for (char c : skip.toCharArray()) {
            skipSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = 0;
            while (count < index) {
                c++;

                if (c > 'z') {
                    c = 'a';
                }

                if (skipSet.contains(c)) {
                    continue;
                }
                count++;
            }
            sb.append(c);
        }

        return sb.toString();
    }
}