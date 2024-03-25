import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] aList = new int[M];
        int[] bList = new int[M];

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            aList[i] = a;
            bList[i] = b;
        }

        int ans = 0;

        for (int i = 1; i <= N; i++) {
            for (int k = 1; k <= N; k++) {
                if (i == k) continue;

                int cnt = 0;
                for (int j = 0; j < M; j++) {
                    int a = aList[j];
                    int b = bList[j];

                    if ((i == a && k == b) || (i == b && k == a)) cnt++;
                }

                ans = Math.max(ans, cnt);
            }
        }

        System.out.print(ans);
    }
}