class Solution {
    public int[] solution(String[] w) {
        int[][] wallpaper = new int[w.length][w[0].length()];
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length; j++) {
                if (w[i].charAt(j) == '.') {
                    wallpaper[i][j] = 0;
                } else {
                    wallpaper[i][j] = 1;
                }
            }
        }
        int minX = 100;
        int minY = 100;
        int maxX = -1;
        int maxY = -1;
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length; j++) {
                if (wallpaper[i][j] == 1) {
                    if (minX > j) {
                        minX = j;
                    }
                    if (minY > i) {
                        minY = i;
                    }
                    if (maxX < j) {
                        maxX = j;
                    }
                    if (maxY < i) {
                        maxY = i;
                    }
                }
            }

        }
        return new int[] { minY, minX, maxY + 1, maxX + 1 };
    }
}