class Solution {
    public int[] solution(String s) {
        int zeroCount = 0;
        int functionCount = 0;
        if (s.equals("1")) {
            return new int[] { 0, 1 };
        }
        String result = s;
        String[] a = new String[2];
        while (!result.equals("1")) {
            a = removeZero(result);
            result = Integer.toBinaryString(a[0].length());
            zeroCount += Integer.parseInt(a[1]);
            functionCount++;
        }
        int[] answer = { functionCount, zeroCount };
        return answer;
    }

    private String[] removeZero(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '0')
                count++;
            else
                sb.append(c);
        }
        return new String[] { sb.toString(), String.valueOf(count) };
    }
}