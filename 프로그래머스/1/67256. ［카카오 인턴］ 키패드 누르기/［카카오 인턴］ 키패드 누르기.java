class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int left = 10;
        int right = 12;

        for (int number : numbers) {
            int target = number == 0 ? 11 : number;

            if (target == 1 || target == 4 || target == 7) {
                sb.append("L");
                left = target;
            } else if (target == 3 || target == 6 || target == 9) {
                sb.append("R");
                right = target;
            } else {
                int leftDistance = getDistance(left, target);
                int rightDistance = getDistance(right, target);

                if (leftDistance < rightDistance) {
                    sb.append("L");
                    left = target;
                } else if (rightDistance < leftDistance) {
                    sb.append("R");
                    right = target;
                } else {
                    if (hand.equals("left")) {
                        sb.append("L");
                        left = target;
                    } else {
                        sb.append("R");
                        right = target;
                    }
                }
            }
        }
        return sb.toString();
    }

    private int getDistance(int current, int target) {
        int currentRow = (current - 1) / 3;
        int currentCol = (current - 1) % 3;

        int targetRow = (target - 1) / 3;
        int targetCol = (target - 1) % 3;

        return Math.abs(currentRow - targetRow) + Math.abs(currentCol - targetCol);
    }
}