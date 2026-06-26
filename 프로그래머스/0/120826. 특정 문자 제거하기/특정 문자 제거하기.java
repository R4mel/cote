class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder stringBuilder = new StringBuilder();
        char c = letter.charAt(0);
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != c) {
                stringBuilder.append(my_string.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}