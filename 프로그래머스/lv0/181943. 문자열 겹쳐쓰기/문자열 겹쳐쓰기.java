class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String first = my_string.substring(0, s);
        String second = my_string.substring(s+ overwrite_string.length());
        return first + overwrite_string + second;
    }
}