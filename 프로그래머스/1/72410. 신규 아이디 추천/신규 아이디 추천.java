class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase()
                .replaceAll("[^a-z0-9._-]", "")
                .replaceAll("\\.{2,}", ".");
        if (answer.startsWith(".")) {
            answer = answer.substring(1);
        }
        if (answer.endsWith(".")) {
            answer = answer.substring(0, answer.length() - 1);
        }
        if (answer.isEmpty()) {
            answer = "a";
        }
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
        }
        if (answer.endsWith(".")) {
            answer = answer.substring(0, answer.length() - 1);
        }
        if (answer.length() <= 2) {
            while (answer.length() < 3) {
                answer += answer.substring(answer.length() - 1);
            }
        }

        return answer;
    }
}