import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int T = sc.nextInt();

        boolean[] infected = new boolean[N + 1];
        infected[P] = true;
        int[] canInfect = new int[N + 1];
        Arrays.fill(canInfect, K);

        int[][] timeTable = new int[251][2];

        for (int n = 0; n < T; n++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            timeTable[t][0] = x;
            timeTable[t][1] = y;
        }

        for (int i = 0; i < timeTable.length; i++) {
            int x = timeTable[i][0];
            int y = timeTable[i][1];

            if (x == 0) continue;

            if (infected[x] && !infected[y]) {
                if (canInfect[x] > 0) {
                    infected[y] = true;
                    canInfect[x]--;
                }
            } else if (infected[y] && !infected[x]) {
                if (canInfect[y] > 0) {
                    infected[x] = true;
                    canInfect[y]--;
                }
            } else if (infected[x] && infected[y]) {
                if (canInfect[x] > 0) canInfect[x]--;
                if (canInfect[y] > 0) canInfect[y]--;
            }
        }

        for (int i = 1; i < infected.length; i++) {
            if (infected[i]) System.out.print(1);
            else System.out.print(0);
        }
    }
}