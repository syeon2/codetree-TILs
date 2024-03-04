import java.util.*;

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
            for (int k = i + 1; k < N; k++) {
                if (i == k) continue;
                if (Math.abs(list[i] - list[k]) > K) continue;

                int temp = 0;

                int min = Math.min(list[i], list[k]);
                int max = Math.max(list[i], list[k]);

                for (int j = 0; j < N; j++) {
                    if (list[j] >= min && list[j] <= max) temp++;
                }

                ans = Math.max(ans, temp);
            }
        }

        System.out.print(ans);
    }
}