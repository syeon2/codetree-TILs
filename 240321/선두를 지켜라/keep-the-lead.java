import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] aTime = new int[1000001];
        int[] bTime = new int[1000001];

        int totalSec = 0;

        int aPos = 1;
        for (int n = 0; n < N; n++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            while (t-- > 0) {
                if (aPos == 0) aTime[aPos] = v;
                else aTime[aPos] = aTime[aPos - 1] + v;

                aPos++;
                totalSec++;
            }
        }

        int bPos = 1;
        for (int m = 0; m < M; m++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            while (t-- > 0) {
                if (bPos == 0) bTime[bPos] = v;
                else bTime[bPos] = bTime[bPos - 1] + v;

                bPos++;
            }
        }

        int winNum = 0; // a == 1, b == 2

        int ans = 0;
        for (int i = 1; i <= totalSec; i++) {
            if (winNum == 0) {
                if (aTime[i] > bTime[i]) winNum = 1;
                else if (bTime[i] > aTime[i]) winNum = 2;
            } else {
                if (winNum == 1 && bTime[i] > aTime[i]) {
                    ans++;
                    winNum = 2;
                } else if (winNum == 2 && aTime[i] > bTime[i]) {
                    ans++;
                    winNum = 1;
                }
            }
        }

        System.out.print(ans);
    }
}