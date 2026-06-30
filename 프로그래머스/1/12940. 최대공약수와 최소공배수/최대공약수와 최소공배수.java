class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);
        return answer;
    }

    public int gcd(int n, int m) {
        while (m != 0) {
            int tmp = m;
            m = n % m;
            n = tmp;
        }

        return n;
    }

    public int lcm(int n, int m) {
        return n * m / gcd(n, m);
    }
}