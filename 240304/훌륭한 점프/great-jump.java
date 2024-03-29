import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] list = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();

            max = Math.max(max, list[i]);
        }

        int ans = N;

        for (int i = max; i >= 1; i--) {
            boolean flag = true;
            int cnt = 0;

            if (list[0] > i || list[N - 1] > i) break;
            
            for (int k = 0; k < N; k++) {
                if (list[k] > i) cnt++;
                else cnt = 0;

                if (cnt == K) {
                    flag = false;
                    break;
                }
            }

            if (flag) ans = i;
        }

        System.out.print(ans);
    }
}