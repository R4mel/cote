import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int lastAttackTime = -1;
        for (int i = 0; i < attacks.length; i++) {
            for (int j = 0; j < 1; j++) {
                if (lastAttackTime < attacks[i][j]) {
                    lastAttackTime = attacks[i][j];
                }
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] attack : attacks) {
            map.put(attack[0], attack[1]);
        }

        int maxHealth = health;
        int timeCount = 0;
        int continuousSuccess = 0;
        while (health >= 0) {
            if (timeCount == lastAttackTime + 1)
                break;

            if (map.getOrDefault(timeCount, 0) != 0) {
                health -= map.get(timeCount);
                continuousSuccess = 0;
            } else if (health <= maxHealth) {
                health += bandage[1];
                if (health >= maxHealth) {
                    health = maxHealth;
                }
                continuousSuccess++;
            }
            if (continuousSuccess == bandage[0]) {
                health += bandage[2];
                if (health >= maxHealth) {
                    health = maxHealth;
                }
                continuousSuccess = 0;
            }
            timeCount++;
        }

        if (health <= 0) {
            return -1;
        }
        return health;
    }
}