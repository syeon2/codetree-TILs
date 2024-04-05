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

        int[] plusMemo = new int[N];
        int[] minusMemo = new int[N];

        plusMemo[0] = 1;
        minusMemo[N - 1] = 1;

        for (int i = 1; i < N; i++) {
            int max = 0;

            for (int k = 0; k < i; k++) {
                if (list[i] > list[k]) {
                    max = Math.max(max, plusMemo[k]);
                }
            }

            plusMemo[i] = max + 1;
        }

        for (int i = N - 2; i >= 0; i--) {
            int max = 0;

            for (int k = N - 1; k > i; k--) {
                if (list[i] > list[k]) {
                    max = Math.max(max, minusMemo[k]);
                }
            }

            minusMemo[i] = max + 1;
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans = Math.max(ans, plusMemo[i] + minusMemo[i] - 1);
        }

        System.out.print(ans);
    }
}