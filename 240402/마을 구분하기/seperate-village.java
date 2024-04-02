import java.util.*;

public class Main {

    public static int N;
    public static int[][] board;
    public static boolean[][] isVisit;

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static List<Integer> ans = new ArrayList<>();

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];
        isVisit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                if (!isVisit[i][k] && board[i][k] != 0) {
                    int cnt = dfs(k, i, 1);

                    ans.add(cnt);
                }
            }
        }

        ans.sort((a, b) -> a - b);

        System.out.println(ans.size());
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

    public static int dfs(int x, int y, int cnt) {
        isVisit[y][x] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (isRange(nx, ny) && board[ny][nx] != 0 && !isVisit[ny][nx]) {
                cnt = dfs(nx, ny, cnt) + 1;
            }
        }

        return cnt;
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}