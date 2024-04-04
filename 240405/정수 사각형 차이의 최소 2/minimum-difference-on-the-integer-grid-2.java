import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] grid = new int[n][n];

        // 격자 정보 입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        // dp 배열 초기화
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = grid[0][0];

        // dp 배열 업데이트
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0) {
                    dp[i][j] = Math.min(dp[i][j], Math.max(dp[i-1][j], grid[i][j]));
                }
                if (j > 0) {
                    dp[i][j] = Math.min(dp[i][j], Math.max(dp[i][j-1], grid[i][j]));
                }
            }
        }

        // 결과 출력
        System.out.println(Math.max(0, dp[n-1][n-1] - dp[0][0]));
    }
}