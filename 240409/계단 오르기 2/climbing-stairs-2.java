import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            list[i] = sc.nextInt();
        }

        int[][] memo = new int[N + 1][4];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(memo[i], -1);
        }

        memo[0][0] = 0;
        memo[1][1] = list[1];
        memo[2][0] = list[2];
        memo[2][2] = memo[1][1] + list[2];

        for (int i = 3; i <= N; i++) {
            
            for (int k = 0; k <= 3; k++) {
                if (k == 0 && i % 2 == 0) memo[i][k] = memo[i - 2][k] + list[i];
                else if (k >= 1 && memo[i - 1][k - 1] != -1) memo[i][k] = memo[i - 1][k - 1] + list[i];
            }
        }

        int ans = 0;
        for (int i = 0; i < 4; i++) {
            ans = Math.max(ans, memo[N][i]);
        }

        System.out.print(ans);
    }
}