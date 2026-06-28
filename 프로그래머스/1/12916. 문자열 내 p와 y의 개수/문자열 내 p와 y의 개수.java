class Solution {
    boolean solution(String s) {
        int p = 0, y = 0;
        String ss = s.toLowerCase();

        for (int i = 0; i < ss.length(); i++) {
            if (ss.charAt(i) == 'p') {
                p++;
            } else if (ss.charAt(i) == 'y') {
                y++;
            }
        }
        return p == y;
    }
}
