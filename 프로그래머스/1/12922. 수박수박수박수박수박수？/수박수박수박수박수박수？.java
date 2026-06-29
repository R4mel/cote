class Solution {
    public String solution(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                stringBuilder.append("수");
            else
                stringBuilder.append("박");
        }
        return stringBuilder.toString();
    }
}