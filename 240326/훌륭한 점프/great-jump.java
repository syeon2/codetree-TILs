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

        int ans = Integer.MAX_VALUE;
        for (int i = Math.max(list[0], list[list.length - 1]); i <= N + 1; i++) {
            int[] arr = new int[N];
            int idx = 0;

            for (int k = 0; k < N; k++) {
                if (i >= list[k]) arr[idx++] = k;
            }

            boolean flag = true;
            for (int k = 1; k < idx; k++) {
                int dist = arr[k] - arr[k - 1];

                if (dist > K) flag = false;
            }

            if (flag) ans = Math.min(ans, i);
        }

        System.out.print(ans);
    }
}