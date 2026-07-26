class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isFirstChar = true;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
                isFirstChar = true;
            } else {
                if (isFirstChar) {
                    sb.append(Character.toUpperCase(c));
                    isFirstChar = false; // 첫 글자 처리 완료
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
        }
        return sb.toString();
    }
}