import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] list = new int[N][2];
        int[] memo = new int[N];

        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            list[i][0] = x1;
            list[i][1] = x2;
        }

        memo[0] = 1;
        for (int i = 1; i < N; i++) {
            int cnt = 0;

            for (int k = 0; k < i; k++) {
                if (isNotCross(list[i], list[k])) {
                    cnt = Math.max(cnt, memo[k]);
                }
            }

            memo[i] = cnt + 1;
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans = Math.max(ans, memo[i]);
        }

        System.out.print(ans);
    }

    public static boolean isNotCross(int[] a, int[] b) {
        if ((a[1] < b[0] && a[1] < b[1]) || (b[1] < a[0] && b[1] < a[1])) return true;

        return false;
    }
}