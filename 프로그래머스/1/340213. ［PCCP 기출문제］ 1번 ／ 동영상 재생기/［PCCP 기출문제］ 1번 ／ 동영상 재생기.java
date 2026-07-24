class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int current = toSecond(pos);
        int videoLen = toSecond(video_len);
        int opStart = toSecond(op_start);
        int opEnd = toSecond(op_end);

        if (current >= opStart && current <= opEnd) {
            current = opEnd;
        }

        for (String cmd : commands) {
            if ("next".equals(cmd)) {
                current = Math.min(videoLen, current + 10);
            } else if ("prev".equals(cmd)) {
                current = Math.max(0, current - 10);
            }

            if (current >= opStart && current <= opEnd) {
                current = opEnd;
            }
        }

        return toMMSS(current);
    }

    private int toSecond(String time) {
        String[] t = time.split(":");
        return Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
    }

    private String toMMSS(int second) {
        return String.format("%02d:%02d", second / 60, second % 60);
    }
}