import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public int solution(int a, int b, int c, int d) {
        HashMap<Integer, Integer> dice = new HashMap<>(); // Map 생성
        dice.put(a, dice.getOrDefault(a, 0)+1); // dice HashMap K로 a 저장, V로 1 저장
        dice.put(b, dice.getOrDefault(b, 0)+1); // 이때, a와 b가 동일할 수도 있기 때문에 b를 K로 호출해서 HashMap에 이미 존재하는지 확인, 존재한다면 +1 추가
        dice.put(c, dice.getOrDefault(c, 0)+1); // 위 주석과 동일한 메커니즘으로 동작하여 최종적으로는 Key(a~d):Value(Count)의 형태로 자료구조가 완성이 됨.
        dice.put(d, dice.getOrDefault(d, 0)+1);
        List<Integer> keys = new ArrayList<>(dice.keySet()); // Map의 key들을 따로 추출하여 List화
        switch(dice.size()){
            case 1: // 모두 같은 수
                return 1111 * a;
            case 2: // 두가지수
                if(dice.get(keys.get(0)) == 1 || dice.get(keys.get(1)) == 1){
                    // 1 : 3
                    int p = dice.get(keys.get(0)) == 3 ? keys.get(0) : keys.get(1);
                    int q = dice.get(keys.get(0)) == 1 ? keys.get(0) : keys.get(1);
                    return (int) Math.pow((10*p)+q, 2);
                }else{
                    // 2 : 2
                    return (keys.get(0) + keys.get(1)) * Math.abs(keys.get(0) - keys.get(1));
                }
            case 3: // 2개 같고, 1, 1 다름
                int result = 0;
                for(Integer key : dice.keySet()){
                    if(dice.get(key) != 2){
                        if(result == 0){
                            result = key;
                        }else{
                            return result * key;
                        }
                    }
                }
            case 4: // 제일 작은 수
                Collections.sort(keys);
                return keys.get(0);
        }
        return 0;
    }
}