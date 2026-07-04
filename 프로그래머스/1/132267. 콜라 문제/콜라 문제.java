class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int tmp1 = n / a * b;
            n = tmp1 + n % a;
            answer += tmp1;
        }

        return answer;
    }
}