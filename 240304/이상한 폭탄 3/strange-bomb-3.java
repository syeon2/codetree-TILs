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
        int max = 0;

        int[] bomb = new int[1000001];

        for (int i = 0; i < N; i++) {

            int start = Math.max(0, i - K);
            int end = Math.min(N - 1, i + K);

            for (int k = start; k <= end; k++) {
                if (k == i) continue;

                if (list[k] == list[i]) {
                    int b = list[i];

                    bomb[b]++;
                    break;
                }
            }
        }

        for (int i = 0; i < bomb.length; i++) {
            if (max <= bomb[i]) {
                max = bomb[i];
                ans = i;
            }
        }

        if (max == 0) System.out.print(max);
        else System.out.print(ans);
    }
}