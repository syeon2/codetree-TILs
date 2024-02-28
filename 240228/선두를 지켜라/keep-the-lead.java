import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] aRecord = new int[1000001];
        int[] bRecord = new int[1000001];

        int aSec = 1;
        int bSec = 1;

        for (int n = 0; n < N; n++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int i = 0; i < t; i++) {
                aRecord[aSec] = aRecord[aSec - 1] + v;
                aSec++;
            }
        }

        for (int m = 0; m < M; m++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int i = 0; i < t; i++) {
                bRecord[bSec] = bRecord[bSec - 1] + v;
                bSec++;
            }
        }

        boolean isAWin = true;
        int cnt = -1;

        for (int i = 0; i < aSec; i++) {
            if (cnt == -1) {
                if (aRecord[i] < bRecord[i]) {
                    isAWin = false;
                    cnt++;
                }
                else if (aRecord[i] > bRecord[i]) {
                    isAWin = true;
                    cnt++;
                }
            } else {
                if (aRecord[i] < bRecord[i] && isAWin) {
                    isAWin = false;
                    cnt++;
                } else if (aRecord[i] > bRecord[i] && !isAWin) {
                    isAWin = true;
                    cnt++;
                }
            }
        }

        if (cnt == -1) System.out.print(0);
        else System.out.print(cnt);
    }
}