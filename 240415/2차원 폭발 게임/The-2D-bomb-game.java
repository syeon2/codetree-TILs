import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int K;

    public static int[][] board;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();

        board = new int[N][N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        while (K-- > 0) {
            for (int c = 0; c < N; c++) {
                bomb(c);
            }
            turnRight();

            for (int c = 0; c < N; c++) {
                drop(c);
            }
        }

        for (int c = 0; c < N; c++) {
            bomb(c);
        }

        int ans = 0;
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (board[r][c] != 0) ans++;
            }
        }

        System.out.print(ans);
    }

    public static void turnRight() {
        int[][] memo = new int[N][N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                memo[r][c] = board[N - 1 - c][r];
            }
        }

        board = memo;
    }

    public static void bomb(int col) {
        boolean bombed = true;

        while (bombed) {
            bombed = false;

            int idx = 0;
            while (idx < N) {
                if (board[idx][col] == 0) idx++;
                else {
                    int start = idx;
                    int end = getEndIdx(col, idx);

                    if (end - start >= M) {
                        for (int i = start; i < end; i++) {
                            board[i][col] = 0;
                        }

                        bombed = true;
                    }

                    idx = end;
                }
            }

            drop(col);
        }
    }

    public static void drop(int col) {
        int[] temp = new int[N];
        int idx = N - 1;

        for (int r = N - 1; r >= 0; r--) {
            if (board[r][col] != 0) temp[idx--] = board[r][col];
        }

        for (int r = 0; r < N; r++) {
            board[r][col] = temp[r];
        }
    }

    public static int getEndIdx(int x, int y) {
        for (int i = y + 1; i < N; i++) {
            if (board[y][x] != board[i][x]) return i;
        }

        return N;
    }
}