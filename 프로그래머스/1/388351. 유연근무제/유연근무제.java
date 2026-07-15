import java.util.*;

// 1은 월요일, 2는 화요일, 3은 수요일, 4는 목요일, 5는 금요일, 6은 토요일, 7은 일요일
class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = schedules.length;
        List<int[]> list = new ArrayList<>();
        for (int[] d : timelogs) {
            list.add(d);
        }

        for (int i = 0; i < schedules.length; i++) {
            int hour = schedules[i] / 100;
            int minute = schedules[i] % 100 + 10;
            if (minute >= 60) {
                hour++;
                minute -= 60;
            }

            int endTime = hour * 100 + minute;

            for (int j = 0; j < timelogs[i].length; j++) {
                int index = (startday - 1 + j) % 7 + 1;
                if (index == 6 || index == 7)
                    continue;
                else {
                    if (endTime < timelogs[i][j]) {
                        answer--;
                        break;
                    }
                }
            }
        }

        return answer;
    }
}