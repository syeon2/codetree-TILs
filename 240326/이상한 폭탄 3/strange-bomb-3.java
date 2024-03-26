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
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int tempCnt = 1;
            int bomb = list[i];

            for (int k = Math.max(0, i - K); k < i; k++) {
                if (list[k] == bomb) tempCnt++;
            }

            for (int k = i + 1; k <= Math.min(N - 1, i + K); k++) {
                if (list[k] == bomb) tempCnt++;
            }

            if (tempCnt == 1) continue;
            else if (cnt < tempCnt) {
                cnt = tempCnt;
                ans = bomb;
            }
        }

        System.out.print(ans);
    }
}