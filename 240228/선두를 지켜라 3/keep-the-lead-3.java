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

        int ans = 1;

        // 1 : A, 2 : B, 3 : A = B;
        int winPerson = (aRecord[1] > bRecord[1]) ? 1 : (aRecord[1] == bRecord[1]) ? 3 : 2;

        for (int i = 2; i < aSec; i++) {
            if (aRecord[i] > bRecord[i] && winPerson != 1) {
                winPerson = 1;
                ans++;
            } else if (aRecord[i] < bRecord[i] && winPerson != 2) {
                winPerson = 2;
                ans++;
            } else if (aRecord[i] == bRecord[i] && winPerson != 3) {
                winPerson = 3;
                ans++;
            }
        }

        System.out.print(ans);
    }
}