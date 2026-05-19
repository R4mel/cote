import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        // 1. 참가자 명단을 맵에 전부 담기 (인원수 +1)
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        
        // 2. 완주자 명단을 보며 맵에서 빼기 (인원수 -1)
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }
        
        // 3. 💡 핵심: 훨씬 쉬운 출력문 (keySet 활용)
        // map.keySet()은 맵에 저장된 "이름"들만 모아서 한 줄로 세워줍니다.
        for (String key : map.keySet()) {
            if (map.get(key) != 0) { // 숫자가 0이 아닌 녀석이 범인!
                answer = key;
                break;
            }
        }
        
        return answer;
    }
}