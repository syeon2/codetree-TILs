import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int ans = 0;

        for (int i = 0; i < N; i++) {

            int start = Math.max(i - K, 0);
            int end = Math.min(i + K, N - 1);

            int bomb = list[i];

            for (int k = start; k <= end; k++) {
                if (k == i) continue;

                if (list[k] == bomb) ans = Math.max(ans, bomb);
            }
        }

        System.out.print(ans);
    }
}