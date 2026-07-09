class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] scores = new int[3];
        int idx = -1;
        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);

            if (ch >= '0' && ch <= '9') {
                if (ch == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                    scores[++idx] = 10;
                    i++;
                } else {
                    scores[++idx] = ch - '0';
                }
            }

            else if (ch == 'S') {
                scores[idx] = scores[idx];
            }

            else if (ch == 'D') {
                scores[idx] = (int) Math.pow(scores[idx], 2);
            }

            else if (ch == 'T') {
                scores[idx] = (int) Math.pow(scores[idx], 3);
            }

            if (ch == '*') {
                scores[idx] *= 2;
                if (idx > 0) {
                    scores[idx - 1] *= 2;
                }
            } else if (ch == '#') {
                scores[idx] *= -1;
            }
        }

        for (int i : scores) {
            answer += i;
        }

        return answer;
    }
}