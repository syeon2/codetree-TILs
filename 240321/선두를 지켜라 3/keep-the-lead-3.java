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

        int curSec = 0;

        for (int n = 0; n < N; n++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            while (t-- > 0) {
                if (curSec == 0) aTime[curSec] = v;
                else aTime[curSec] = aTime[curSec - 1] + v;

                curSec++;
                totalSec++;
            }
        }

        curSec = 0;

        for (int m = 0; m < M; m++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            while (t-- > 0) {
                if (curSec == 0) bTime[curSec] = v;
                else bTime[curSec] = bTime[curSec - 1] + v;

                curSec++;
            }
        }

        int ans = 0;
        int winNum = 0; // 0 : 공동, 1 : A, 2 : B

        for (int i = 1; i < totalSec; i++) {
            if (winNum != 0 && aTime[i] == bTime[i]) {
                ans++;
                winNum = 0;
            } else if (winNum != 1 && aTime[i] > bTime[i]) {
                ans++;
                winNum = 1;
            } else if (winNum != 2 && bTime[i] > aTime[i]) {
                ans++;
                winNum = 2;
            }
        }

        System.out.print(ans);
    }
}