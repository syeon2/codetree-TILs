import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();

        int[][] board = new int[2][N];
        for (int i = 0; i < N; i++) {
            board[0][i] = sc.nextInt();
        }

        for (int i = N - 1; i >= 0; i--) {
            board[1][i] = sc.nextInt();
        }

        while (T-- > 0) {
            int first = board[0][N - 1];
            int second = board[1][0];

            for (int i = N - 1; i >= 1; i--) {
                board[0][i] = board[0][i - 1];
            }

            for (int i = 1; i < N; i++) {
                board[1][i - 1] = board[1][i];
            }

            board[0][0] = second;
            board[1][N - 1] = first;
        }

        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", board[0][i]);
        }
        System.out.println();
        for (int i = N - 1; i >= 0; i--) {
            System.out.printf("%d ", board[1][i]);
        }
    }
}