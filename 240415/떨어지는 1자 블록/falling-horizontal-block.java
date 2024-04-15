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

        boolean isDone = false;

        for (int r = 0; r < N; r++) {
            for (int c = (K - 1); c <= (K - 1) + M - 1; c++) {
                if (board[r][c] != 0) {

                    for (int i = (K - 1); i <= (K - 1) + M - 1; i++) {
                        board[r - 1][i] = 1;
                    }

                    isDone = true;
                    break;
                }
            }

            if (isDone) break;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                sb.append(board[i][k]).append(" ");
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}