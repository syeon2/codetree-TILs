import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] aList = new int[N];
        for (int i = 0; i < N; i++) {
            aList[i] = sc.nextInt();
        }

        int[] bList = new int[M];
        for (int i = 0; i < M; i++) {
            bList[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i <= N - M; i++) {
            int[] memo = new int[M];
            for (int k = 0; k < M; k++) {
                memo[k] = bList[k];
            }

            for (int k = 0; k < M; k++) {
                for (int j = 0; j < M; j++) {
                    if (aList[k + i] == memo[j]) {
                        memo[j] = 0;
                        break;
                    }
                }
            }

            boolean flag = true;
            for (int k = 0; k < M; k++) {
                if (memo[k] != 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) ans++;
        }

        System.out.print(ans);
    }
}