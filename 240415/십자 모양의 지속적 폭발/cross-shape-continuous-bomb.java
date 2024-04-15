import java.util.*;

public class Main {
    public static int N;
    public static int M;
    public static int[][] board;

    public static int[][] memo;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        board = new int[N][N];
        memo = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        while (M-- > 0) {
            int col = sc.nextInt() - 1;
            int row = getBombedRow(col);

            if (row == -1) continue;

            bomb(col, row);
        }

        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                sb.append(board[r][c]).append(" ");
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }

    public static void bomb(int x, int y) {
        int range = board[y][x];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if ((r == y || c == x) && Math.abs(r - y) + Math.abs(c - x) < range) board[r][c] = 0;
            }
        }

        drop();
    } 

    public static void drop() {
        for (int c = 0; c < N; c++) {
            int idx = N - 1;

            for (int r = N - 1; r >= 0; r--) {
                if (board[r][c] != 0) memo[idx--][c] = board[r][c];
            }
        }

        board = memo;
        memo = new int[N][N];
    }

    public static int getBombedRow(int col) {
        for (int r = 0; r < N; r++) {
            if (board[r][col] != 0) return r;
        }

        return -1;
    }
}