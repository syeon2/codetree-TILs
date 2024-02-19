import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] nList = new int[N];
        for (int i = 0; i < N; i++) {
            nList[i] = sc.nextInt();
        }

        int[] mList = new int[M];
        for (int i = 0; i < M; i++) {
            mList[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i <= N - M; i++) {
            int[] cnt = new int[101];

            for (int k = i; k < i + M; k++) {
                int idx = nList[k];

                cnt[idx]++;
            }

            boolean flag = true;
            for (int k = 0; k < M; k++) {
                int idx = mList[k];

                cnt[idx]--;

                if (cnt[idx] < 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) ans++;
        }

        System.out.print(ans);
    }
}