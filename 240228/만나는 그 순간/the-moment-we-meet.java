import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] aTime = new int[1001];
        int[] bTime = new int[1001];

        int N = sc.nextInt();
        int M = sc.nextInt();

        int aPos = 0;
        int aSec = 1;

        int bPos = 0;
        int bSec = 1;

        for (int n = 0; n < N; n++) {
            char direc = sc.next().charAt(0);
            int move = sc.nextInt();

            if (direc == 'R') {
                for (int i = 1; i <= move; i++) {
                    aTime[aSec++] = ++aPos;
                }
            } else {
                for (int i = 1; i <= move; i++) {
                    aTime[aSec++] = --aPos;
                }
            }
        }

        for (int m = 0; m < M; m++) {
            char direc = sc.next().charAt(0);
            int move = sc.nextInt();

            if (direc == 'R') {
                for (int i = 1; i <= move; i++) {
                    bTime[bSec++] = ++bPos;
                }
            } else {
                for (int i = 1; i <= move; i++) {
                    bTime[bSec++] = --bPos;
                }
            }
        }

        int ans = 0;
        for (int i = 1; i < aTime.length; i++) {
            if (aTime[i] == bTime[i]) {
                ans = i;
                break;
            }
        }

        System.out.print(ans);
    }
}