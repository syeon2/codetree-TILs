import java.util.*;

public class Main {

    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};

    public static int N;
    public static int R;
    public static int C;

    public static int[][] board;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        R = sc.nextInt() - 1;
        C = sc.nextInt() - 1;

        board = new int[N][N];
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        int curX = C;
        int curY = R;

        Queue<Integer> que = new LinkedList<>();
        que.add(board[curY][curX]);

        while (true) {
            int nextX = -1;
            int nextY = -1;
            int maxValue = 0;
            
            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (isRange(nx, ny) && board[curY][curX] < board[ny][nx] && board[ny][nx] > maxValue) {
                    maxValue = board[ny][nx];
                    nextX = nx;
                    nextY = ny;
                    break;
                }
            }

            if (maxValue == 0) break;
            else {
                curX = nextX;
                curY = nextY;

                que.add(maxValue);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!que.isEmpty()) {
            sb.append(que.remove()).append(" ");
        }

        System.out.print(sb);
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}