import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] grid = new int[n][n];

        // 격자 정보 입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        // 방문 여부를 저장하는 visited 배열
        boolean[][] visited = new boolean[n][n];
        // 최솟값과 최댓값을 저장하는 minDiff 배열
        int[][] minDiff = new int[n][n];
        // 초기화
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                minDiff[i][j] = Integer.MAX_VALUE;
            }
        }
        // 시작 위치 초기화
        minDiff[0][0] = grid[0][0];
        visited[0][0] = true;

        // BFS를 사용하여 최소 차이 계산
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        int[][] directions = {{1, 0}, {0, 1}};
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            for (int[] dir : directions) {
                int nx = x + dir[0];
                int ny = y + dir[1];
                if (nx < n && ny < n) {
                    int diff = Math.abs(grid[nx][ny] - minDiff[x][y]);
                    int newDiff = Math.max(minDiff[x][y], grid[nx][ny]);
                    if (!visited[nx][ny] || diff < minDiff[nx][ny]) {
                        minDiff[nx][ny] = newDiff;
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
        }

        // 결과 출력
        System.out.println(Math.abs(minDiff[n - 1][n - 1] - minDiff[0][0]));
    }
}