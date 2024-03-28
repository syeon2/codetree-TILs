import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int possibleRow = -1;
        for (int r = 0; r < N; r++) {
            int startC = K - 1;
            int endC = (K - 1) + M - 1;

            boolean possible = true;
            for (int c = startC; c <= endC; c++) {
                if (board[r][c] != 0) possible = false;
            }

            if (possible) possibleRow = r;
            else break;
        }

        if (possibleRow != -1) {
            for (int i = K - 1; i <= (K - 1) + M - 1; i++) {
                board[possibleRow][i] = 1;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                System.out.printf("%d ", board[i][k]);
            }

            System.out.println();
        }
    }
}