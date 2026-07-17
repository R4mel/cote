class Solution {
    public int[] solution(String[] park, String[] routes) {
        int x = 0;
        int y = 0;

        char[][] arr = new char[park.length][park[0].length()];

        for (int i = 0; i < park.length; i++) {
            arr[i] = park[i].toCharArray();

            if (park[i].contains("S")) {
                x = i; // 행
                y = park[i].indexOf("S"); // 열
            }
        }

        for (String route : routes) {
            String direction = route.split(" ")[0];
            int distance = Integer.valueOf(route.split(" ")[1]);

            int nx = x;
            int ny = y;

            for (int i = 0; i < distance; i++) {
                if (direction.equals("E")) {
                    ny++; // 열 증가
                } else if (direction.equals("W")) {
                    ny--; // 열 감소
                } else if (direction.equals("S")) {
                    nx++; // 행 증가
                } else {
                    nx--; // 행 감소
                }

                if (nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length) {
                    if (arr[nx][ny] == 'X') {
                        break;
                    }

                    if (i == distance - 1) {
                        x = nx;
                        y = ny;
                    }
                }
            }
        }

        return new int[] { x, y };
    }
}