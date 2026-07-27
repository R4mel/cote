class Solution {
    public int solution(int n) {
        int answer = 1;
        for (int i = 1; i < n; i++) {
            int tmp = n;
            for (int j = i; j < n; j++) {
                tmp -= j;
                if (tmp == 0) {
                    answer++;
                    break;
                } else if (tmp < 0) {
                    break;
                }
            }
        }
        return answer;
    }
}