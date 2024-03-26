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

        for (int i = 0; i <= 10000; i++) {
            int cnt = 0;
            int pivot = i;

            for (int k = 0; k < N; k++) {
                if (pivot <= list[k] && list[k] <= pivot + K) cnt++;
            }

            ans = Math.max(ans, cnt);
        }

        System.out.print(ans);
    }
}