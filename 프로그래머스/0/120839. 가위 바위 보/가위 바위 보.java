class Solution {
    public String solution(String rsp) {
        StringBuilder s = new StringBuilder();
        for (char c : rsp.toCharArray()) {
            if (c == '2')
                s.append('0');
            else if (c == '0')
                s.append('5');
            else
                s.append('2');
        }

        return s.toString();
    }
}