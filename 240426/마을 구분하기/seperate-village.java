import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int N;
    public static int[][] board;
    public static boolean[][] visited;

    public static Queue<Integer> que = new PriorityQueue<>();

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];
        visited = new boolean[N][N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (visited[r][c] || board[r][c] == 0) continue;

                ans++;
                int people = dfs(c, r, 1);

                que.add(people);
            }
        }

        System.out.println(ans);

        while (!que.isEmpty()) {
            System.out.println(que.remove());
        }
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static int dfs(int x, int y, int cnt) {
        visited[y][x] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (isRange(nx, ny) && !visited[ny][nx] && board[ny][nx] == 1) {
                cnt = dfs(nx, ny, cnt + 1);
            }
        }

        return cnt;
    }
}