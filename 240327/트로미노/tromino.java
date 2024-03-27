import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] board = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int ans = 0;

        for (int i = 0; i < N; i++) {
            for (int k = 0; k <= M - 3; k++) {
                int sum = 0;

                for (int j = k; j < k + 3; j++) {
                    sum += board[i][j];
                }

                ans = Math.max(ans, sum);
            }
        }

        for (int i = 0; i <= N - 3; i++) {
            for (int k = 0; k < M; k++) {
                int sum = 0;

                for (int j = i; j < i + 3; j++) {
                    sum += board[j][k];
                }

                ans = Math.max(ans, sum);
            }
        }

        for (int i = 0; i <= N - 2; i++) {
            for (int k = 0; k <= M - 2; k++) {
                int sum = 0;
                int min = 1001;

                for (int j = i; j < i + 2; j++) {
                    for (int l = k; l < k + 2; l++) {
                        sum += board[j][l];

                        min = Math.min(min, board[j][l]);
                    }
                }

                ans = Math.max(ans, sum - min);
            }
        }

        System.out.print(ans);
    }
}