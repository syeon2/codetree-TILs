import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] list = new int[N][3];
        for (int i = 0; i < N; i++) {
            list[i][0] = sc.nextInt();
            list[i][1] = sc.nextInt();
            list[i][2] = sc.nextInt();
        }

        int[] memo = new int[N];

        Arrays.sort(list, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }

            return a[0] - b[0];
        });

        memo[0] = list[0][2];

        for (int i = 1; i < N; i++) {
            int pay = 0;

            for (int k = 0; k < i; k++) {
                if (isNotCross(list[i], list[k])) {
                    pay = Math.max(pay, memo[k]);
                }
            }

            memo[i] = pay + list[i][2];
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans = Math.max(ans, memo[i]);
        }

        System.out.print(ans);
    }

    public static boolean isNotCross(int[] a, int[] b) {
        if (a[0] <= b[0] && a[1] >= b[0]) return false;
        if (b[0] <= a[0] && b[1] >= a[0]) return false;

        return true;
    }
}