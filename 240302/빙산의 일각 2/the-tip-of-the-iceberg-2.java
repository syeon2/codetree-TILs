import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int ans = 0;

        for (int i = 1; i <= 1000; i++) {

            int cnt = 0;

            if (list[0] > 0 && list[1] <= 0) cnt++;
            for (int k = 1; k < N ; k++) {
                if (list[k - 1] - i <= 0 && list[k] - i > 0) cnt++;
            }
            if (list[N - 1] > 0 && list[N - 2] > 0) cnt++;

            ans = Math.max(ans, cnt);
        }

        System.out.print(ans);
    }
}