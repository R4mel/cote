import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            // 현재 점수 추가
            pq.offer(score[i]);

            // 명예의 전당 크기가 k를 넘으면 가장 낮은 점수 제거
            if (pq.size() > k) {
                pq.poll();
            }

            // 현재 명예의 전당의 최하위 점수
            answer[i] = pq.peek();
        }

        return answer;
    }
}