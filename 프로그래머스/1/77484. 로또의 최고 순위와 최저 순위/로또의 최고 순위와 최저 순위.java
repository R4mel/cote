class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        // 44 1 0 0 31 25
        // 44 1 10 6 31 25
        // 31 10 45 1 6 19
        int min = 0;
        int max = 0;
        for(int i=0; i< lottos.length; i++) {
            if(lottos[i] == 0) {
                max++;
            }
            for(int j =0; j<lottos.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    min++;
                    max++;
                    break;
                }
            }
        }
answer[0] = max > 1 ? 7 - max : 6;
answer[1] = min > 1 ? 7 - min : 6;
        return answer;
    }
}