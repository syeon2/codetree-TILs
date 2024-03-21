import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] list = new int[N][2];

        for (int n = 0; n < N; n++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            list[n][0] = x;
            list[n][1] = y;
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 1; i < N - 1; i++) {
            int temp = 0;

            for (int k = 1; k < N; k++) {
                if (i == k) continue;
                else if (i == k - 1) {
                    temp += Math.abs(list[k - 2][0] - list[k][0]) + Math.abs(list[k - 2][1] - list[k][1]);
                } else {
                    temp += Math.abs(list[k - 1][0] - list[k][0]) + Math.abs(list[k - 1][1] - list[k][1]);
                }
            }

            ans = Math.min(ans, temp);
        }

        System.out.print(ans);
    }
}