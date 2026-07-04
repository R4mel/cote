class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int painted = 0;
        for (int start : section) {
            if (painted <= start) {
                painted = start + m;
                answer++;
            }
        }
        return answer;
    }
}