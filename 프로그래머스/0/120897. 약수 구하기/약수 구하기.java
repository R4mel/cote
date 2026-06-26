class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                cnt++;
        }

        int[] answer = new int[cnt];
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[count++] = i;
            }
        }
        return answer;
    }
}