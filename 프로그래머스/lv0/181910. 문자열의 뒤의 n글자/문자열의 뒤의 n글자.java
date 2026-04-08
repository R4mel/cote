class Solution {
    public String solution(String my_string, int n) {
        int tmp = my_string.length() - n;
        return my_string.substring(tmp,my_string.length());
    }
}