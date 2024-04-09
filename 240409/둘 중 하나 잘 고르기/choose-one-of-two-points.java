import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 0 : red, 1 : blue
        int[][] list = new int[(2 * N) + 1][2];
        for (int i = 1; i <= (2 * N); i++) {
            list[i][0] = sc.nextInt();
            list[i][1] = sc.nextInt();
        }

        int[][][] memo = new int[(2 * N) + 1][N + 1][N + 1];

        for (int i = 1; i <= (2 * N); i++) {
            int red = list[i][0];
            int blue = list[i][1];

            for (int k = 0; k <= i; k++) {
                for (int j = 0; j <= i; j++) {
                    if (k + j == i && k <= N && j == 0) memo[i][k][j] = memo[i - 1][k - 1][j] + red;
                    else if (k + j == i && j <= N && k == 0) memo[i][k][j] = memo[i - 1][k][j - 1] + blue;
                    else {
                        if (k + j == i && k <= N && j <= N) {
                            memo[i][k][j] = Math.max(memo[i - 1][k - 1][j] + red, memo[i - 1][k][j - 1] + blue);
                        }
                    }
                }
            }
        }

        int ans = 0;
        for (int i = 0; i <= N; i++) {
            for (int k = 0; k <= N; k++) {
                ans = Math.max(ans, memo[(2 * N)][i][k]);
            }
        }

        System.out.print(ans);
    }
}