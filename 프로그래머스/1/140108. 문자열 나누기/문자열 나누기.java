class Solution {
    public int solution(String s) {
        int answer = 0;
        while (s.length() > 0) {
            char x = s.charAt(0);
            int x_same = 0;
            int x_other = 0;
            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == x) {
                    x_same++;
                    count++;
                } else {
                    x_other++;
                    count++;
                }
                if (x_same == x_other)
                    break;
            }
            s = s.substring(count);

            answer++;
        }

        return answer;
    }
}