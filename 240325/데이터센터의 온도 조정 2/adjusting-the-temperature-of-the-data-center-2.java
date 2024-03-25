import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int C = sc.nextInt();
        int G = sc.nextInt();
        int H = sc.nextInt();

        int[][] degree = new int[N][2];
        for (int n = 0; n < N; n++) {
            degree[n][0] = sc.nextInt();
            degree[n][1] = sc.nextInt();
        }

        int ans = 0;

        for (int i = 0; i <= 1000; i++) {
            int sum = 0;

            for (int k = 0; k < N; k++) {
                int ta = degree[k][0];
                int tb = degree[k][1];

                if (i < ta) sum += C;
                else if (i >= ta && i <= tb) sum += G;
                else sum += H;
            }

            if (ans < sum) ans = sum;
        }

        System.out.print(ans);
    }
}