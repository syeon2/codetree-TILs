import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String str = sc.next();

            for (int k = 0; k < M; k++) {
                board[i][k] = str.charAt(k);
            }
        }

        char[][] ans = new char[N * K][M * K];

        for (int i = 0; i < N * K; i++) {
            for (int k = 0; k < M * K; k++) {

                ans[i][k] = board[i / K][k / K];
            }
        }

        for (int i = 0; i < N * K; i++) {
            for (int k = 0; k < M * K; k++) {
                System.out.print(ans[i][k]);
            }

            System.out.println();
        }
    }
}