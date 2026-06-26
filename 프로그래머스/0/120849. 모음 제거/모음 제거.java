class Solution {
    public String solution(String my_string) {
        String aeiou = "aeiou";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (!aeiou.contains("" + my_string.charAt(i))) {
                result.append(my_string.charAt(i));
            }
        }

        return result.toString();
    }
}