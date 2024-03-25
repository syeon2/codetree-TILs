import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] list = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list[a][b] += 1;
            list[b][a] += 1;
        }

        int ans = 0;
        for (int i = 0; i <= N; i++) {
            for (int k = 0; k <= N; k++) {
                ans = Math.max(ans, list[i][k]);
            }
        }

        System.out.print(ans);
    }
}