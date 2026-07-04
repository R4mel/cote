class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int c = count(i);
            if (c > limit) {
                answer += power;
            } else {
                answer += c;
            }
        }
        return answer;
    }

    private int count(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
}