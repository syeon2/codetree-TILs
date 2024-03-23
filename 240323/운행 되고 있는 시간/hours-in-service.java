import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] list = new int[N][2];
        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            list[i][0] = x1;
            list[i][1] = x2;
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            int[] time = new int[1001];

            for (int k = 0; k < N; k++) {
                if (i == k) continue;

                int x1 = list[k][0];
                int x2 = list[k][1];

                for (int j = x1; j < x2; j++) {
                    time[j] = 1;
                }
            }

            int temp = 0;
            for (int k = 0; k < time.length; k++) {
                if (time[k] == 1) temp++;
            }

            ans = Math.max(ans, temp);
        }

        System.out.print(ans);
    }
}