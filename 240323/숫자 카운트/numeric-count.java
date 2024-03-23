import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] isUniqueNum = new int[1000];

        for (int n = 0; n < N; n++) {
            int num = sc.nextInt();

            int a1 = num / 100;
            int b1 = (num - (num / 100 * 100)) / 10;
            int c1 = num % 10;

            int s = sc.nextInt();
            int b = sc.nextInt();

            for (int i = 1; i <= 9; i++) {
                for (int k = 1; k <= 9; k++) {
                    if (i == k) continue;

                    for (int j = 1; j <= 9; j++) {
                        if (i == j || k == j) continue;

                        int sCnt = 0;
                        int bCnt = 0;

                        if (a1 == i) sCnt++;
                        if (b1 == k) sCnt++;
                        if (c1 == j) sCnt++;

                        if (a1 == k || a1 == j) bCnt++;
                        if (b1 == i || b1 == j) bCnt++;
                        if (c1 == i || c1 == k) bCnt++;

                        int idx = (i * 100) + (k * 10) + j;

                        if (s == sCnt && b == bCnt) isUniqueNum[idx]++;
                    }
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < isUniqueNum.length; i++) {
            if (isUniqueNum[i] == N) ans++;
        }

        System.out.print(ans);
    }
}