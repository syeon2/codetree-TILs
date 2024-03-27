import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();

        int[] fBelt = new int[N];
        int[] sBelt = new int[N];
        int[] tBelt = new int[N];

        for (int i = 0; i < N; i++) {
            fBelt[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            sBelt[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            tBelt[i] = sc.nextInt();
        }

        while (T-- > 0) {
            int fValue = fBelt[N - 1];
            int sValue = sBelt[N - 1];
            int tValue = tBelt[N - 1];

            for (int i = N - 1; i >= 1; i--) {
                fBelt[i] = fBelt[i - 1];
                sBelt[i] = sBelt[i - 1];
                tBelt[i] = tBelt[i - 1];
            }

            fBelt[0] = tValue;
            sBelt[0] = fValue;
            tBelt[0] = sValue;
        }

        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", fBelt[i]);
        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", sBelt[i]);
        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", tBelt[i]);
        }
    }
}