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

    public static boolean canOpen(int i, int k, int N) {
        if (i == 1) {
            if (k <= 3 || k >= N - 2) return true;
            else return false;
        } else if (i == 2) {
            if (k <= 4 || k >= N - 1) return true;
            else return false;
        } else if (i == 8) {
            if (k <= 1 || k >= 6) return true;
            else return false;
        } else if (i == 9) {
            if (k <= 2 || k >= 7) return true;
            else return false;
        } else {
            if (Math.abs(i - k) <= 2) return true;
            else return false;
        }
    }
}