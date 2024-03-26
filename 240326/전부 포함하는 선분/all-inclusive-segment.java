import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] list = new int[N][2];
        for (int i = 0; i < N; i++) {
            list[i][0] = sc.nextInt();
            list[i][1] = sc.nextInt();
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int x1 = 100;
            int x2 = 1;

            for (int k = 0; k < N; k++) {
                if (i == k) continue;

                int x3 = list[k][0];
                int x4 = list[k][1];

                x1 = Math.min(x1, x3);
                x2 = Math.max(x2, x4);
            }

            ans = Math.min(ans, x2 - x1);
        }

        System.out.print(ans);
    }
}