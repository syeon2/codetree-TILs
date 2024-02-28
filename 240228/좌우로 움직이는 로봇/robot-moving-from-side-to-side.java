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
            int move = sc.nextInt();
            char direc = sc.next().charAt(0);

            if (direc == 'R') {
                for (int i = 0; i < move; i++) {
                    aRecord[aSec] = aRecord[aSec - 1] + 1;
                    aSec++;
                }
            } else {
                for (int i = 0; i < move; i++) {
                    aRecord[aSec] = aRecord[aSec - 1] - 1;
                    aSec++;
                }
            }
        }

        for (int m = 0; m < M; m++) {
            int move = sc.nextInt();
            char direc = sc.next().charAt(0);

            if (direc == 'R') {
                for (int i = 0; i < move; i++) {
                    bRecord[bSec] = bRecord[bSec - 1] + 1;
                    bSec++;
                }
            } else {
                for (int i = 0; i < move; i++) {
                    bRecord[bSec] = bRecord[bSec - 1] - 1;
                    bSec++;
                }
            }
        }

        for (int i = aSec; i < aRecord.length; i++) {
            aRecord[i] = aRecord[i - 1];
        }

        for (int i = bSec; i < bRecord.length; i++) {
            bRecord[i] = bRecord[i - 1];
        }

        int ans = 0;
        for (int i = 1; i < aRecord.length; i++) {
            if (aRecord[i - 1] != bRecord[i - 1] && aRecord[i] == bRecord[i]) ans++;
        }

        System.out.print(ans);
    }
}