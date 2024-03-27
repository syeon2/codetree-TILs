import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int ans = 0;

        for (int i = 0; i <= N - 3; i++) {
            for (int k = 0; k <= N - 3; k++) {
                int sum = 0;

                for (int j = i; j < i + 3; j++) {
                    for (int l = k; l < k + 3; l++) {
                        sum += board[j][l];
                    }
                }

                ans = Math.max(ans, sum);
            }
        }

        System.out.print(ans);
    }
}