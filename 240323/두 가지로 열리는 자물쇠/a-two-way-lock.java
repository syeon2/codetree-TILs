import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();

        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();

        int ans = 0;

        for (int i = 1; i <= N; i++) {
            for (int k = 1; k <= N; k++) {
                for (int j = 1; j <= N; j++) {
                    if (canOpen(i, a1, N) && canOpen(k, b1, N) && canOpen(j, c1, N)) ans++;
                    else if (canOpen(i, a2, N) && canOpen(k, b2, N) && canOpen(j, c2, N)) ans++;
                }
            }
        }

        System.out.print(ans);
    }

    public static boolean canOpen(int a, int b, int N) {
        if (Math.abs(a - b) <= 2) return true;

        if (a == 2 && b >= N) return true;
        if (a == 1 && b >= N - 1) return true;
        if (a == N && b <= 2) return true;
        if (a == N - 1 && b <= 1) return true;

        if (b == 2 && a >= N) return true;
        if (b == 1 && a >= N - 1) return true;
        if (b == N && a <= 2) return true;
        if (b == N - 1 && a <= 1) return true;

        return false;
    }
}