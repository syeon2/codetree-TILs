import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] aTime = new int[1000001];
        int[] bTime = new int[1000001];

        int curSec = 1;

        for (int n = 0; n < N; n++) {
            int move = sc.nextInt();
            char direc = sc.next().charAt(0);

            while (move-- > 0) {
                if (direc == 'R') {
                    if (curSec == 1) aTime[curSec] = 1;
                    else aTime[curSec] = aTime[curSec - 1] + 1;

                    curSec++;
                } else {
                    if (curSec == 1) aTime[curSec] = -1;
                    else aTime[curSec] = aTime[curSec - 1] - 1;

                    curSec++;
                }
            }
        }

        for (int i = curSec; i < aTime.length; i++) {
            aTime[i] = aTime[i - 1];
        }

        curSec = 1;

        for (int m = 0; m < M; m++) {
            int move = sc.nextInt();
            char direc = sc.next().charAt(0);

            while (move-- > 0) {
                if (direc == 'R') {
                    if (curSec == 1) bTime[curSec] = 1;
                    else bTime[curSec] = bTime[curSec - 1] + 1;

                    curSec++;
                } else {
                    if (curSec == 1) bTime[curSec] = -1;
                    else bTime[curSec] = bTime[curSec - 1] - 1;

                    curSec++;
                }
            }
        }

        for (int i = curSec; i < bTime.length; i++) {
            bTime[i] = bTime[i - 1];
        }

        int ans = 0;

        for (int i = 1; i < aTime.length; i++) {
            if (aTime[i - 1] != bTime[i - 1] && aTime[i] == bTime[i]) ans++;
        }

        System.out.print(ans);
    }
}