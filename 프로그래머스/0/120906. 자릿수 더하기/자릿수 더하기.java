class Solution {
    public int solution(int n) {
        int answer = 0;
        String nn = String.valueOf(n);
        for (char c : nn.toCharArray()) {
            answer += c - '0';
        }
        return answer;
    }
}