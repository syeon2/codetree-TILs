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
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N - 2; k++) {

                for (int j = 0; j < N; j++) {
                    for (int l = 0; l < N - 2; l++) {
                        if (i == j) {
                            if (k == l || k == l + 1 || k == l + 2 || k + 1 == l || k + 2 == l) continue;
                        }

                        int sum = 0;

                        for (int n = k; n < k + 3; n++) {
                            sum += board[i][n];
                        }

                        for (int n = l; n < l + 3; n++) {
                            sum += board[j][n];
                        }

                        ans = Math.max(ans, sum);
                    }
                }
            }
        }

        System.out.print(ans);
    }
}