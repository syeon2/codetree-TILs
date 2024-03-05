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
            int tempX1 = 101;
            int tempX2 = 0;

            for (int k = 0; k < N; k++) {
                if (i == k) continue;

                int x1 = list[k][0];
                int x2 = list[k][1];

                tempX1 = Math.min(x1, tempX1);
                tempX2 = Math.max(x2, tempX2);
            }

            ans = Math.min(ans, tempX2 - tempX1);
        }

        System.out.print(ans);
    }
}