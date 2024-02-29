import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] num = new int[N];
        int[] strikes = new int[N];
        int[] balls = new int[N];

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int b = sc.nextInt();

            num[i] = n;
            strikes[i] = s;
            balls[i] = b;
        }

        int ans = 0;
        for (int i = 1; i <= 9; i++) {
            for (int k = 1; k <= 9; k++) {
                if (i == k) continue;

                for (int j = 1; j <= 9; j++) {
                    if (i == j || k == j) continue;

                    int number = (i * 100) + (k * 10) + j;

                    boolean flag = true;
                    for (int l = 0; l < N; l++) {
                        if (!(cntStrike(number, num[l]) == strikes[l] && cntBall(number, num[l]) == balls[l])) {
                            flag = false;
                        }
                    }

                    if (flag) ans++;
                }
            }
        }

        System.out.print(ans);
    }

    public static int cntStrike(int a, int b) {
        int cnt = 0;

        while (a > 0 && b > 0) {
            int tempA = a % 10;
            int tempB = b % 10;

            if (tempA == tempB) cnt++;

            a /= 10;
            b /= 10;
        }

        return cnt;
    }

    public static int cntBall(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);

        int cnt = 0;
        for (int i = 0; i < 3; i++) {

            for (int k = 0; k < 3; k++) {
                if (i == k) continue;

                if (strA.charAt(i) == strB.charAt(k)) cnt++;
            }
        }

        return cnt;
    }
}