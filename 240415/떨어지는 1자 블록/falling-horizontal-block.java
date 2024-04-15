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

        int startX = K - 1;
        int endX = (K - 1) + M - 1;

        int row = getLimitRow(startX, endX);

        for (int c = startX; c <= endX; c++) {
            board[row][c] = 1;
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

    public static int getLimitRow(int startX, int endX) {
        for (int r = 0; r < N; r++) {
            for (int c = startX; c <= endX; c++) {
                if (board[r][c] != 0) return r - 1;
            }
        }

        return N - 1;
    }
}