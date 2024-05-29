import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        maps[0][0] = 0;
        int count = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];

                // 도착점에 도달한 경우
                if (x == maps[0].length - 1 && y == maps.length - 1) return count;
                for (int[] dir : directions) {
                    int nx = x + dir[0];
                    int ny = y + dir[1];
                    if (nx >= 0 && nx < maps[0].length && ny >= 0 && ny < maps.length && maps[ny][nx] == 1) {
                        queue.add(new int[]{nx, ny});
                        maps[ny][nx] = 0;
                    }
                }
            }
            count++;
        }
        return -1;
    }
}