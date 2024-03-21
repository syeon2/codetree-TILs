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

        int ans = -1;

        for (int i = 0; i < N; i++) {
            for (int k = i + 1; k < N; k++) {
                for (int l = k + 1; l < N; l++) {
                    if (isNonCarry(list[i], list[k], list[l])) {
                        ans = Math.max(ans, list[i] + list[k] + list[l]);
                    }
                }
            }
        }

        System.out.print(ans);
    }

    public static boolean isNonCarry(int A, int B, int C) {
        int a = A;
        int b = B;
        int c = C;

        while (a > 0 && b > 0) {
            int tempA = a % 10;
            int tempB = b % 10;

            if (tempA + tempB >= 10) return false;

            a /= 10;
            b /= 10;
        }

        int ab = A + B;

        while (ab > 0 && c > 0) {
            int tempAB = ab % 10;
            int tempC = c % 10;

            if (tempAB + tempC >= 10) return false;

            ab /= 10;
            c /= 10;
        }

        return true;
    }
}