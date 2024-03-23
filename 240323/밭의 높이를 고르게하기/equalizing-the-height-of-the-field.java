import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int H = sc.nextInt();
        int T = sc.nextInt();

        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i <= N - T; i++) {
            int sum = 0;

            for (int k = i; k < i + T; k++) {
                sum += Math.abs(list[k] - H);
            }

            if (sum > 0) ans = Math.min(ans, sum);
        }

        System.out.print(ans);
    }
}