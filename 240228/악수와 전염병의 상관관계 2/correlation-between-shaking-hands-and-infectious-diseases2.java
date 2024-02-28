import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int T = sc.nextInt();

        boolean[] isContagious = new boolean[N + 1];
        isContagious[P] = true;

        int[] canContagious = new int[N + 1];
        Arrays.fill(canContagious, K);

        int[][] records = new int[251][2];

        for (int t = 0; t < T; t++) {
            int sec = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            records[sec][0] = x;
            records[sec][1] = y;
        }

        for (int i = 0; i <= 250; i++) {
            int x = records[i][0];
            int y = records[i][1];

            if (x == 0 && y == 0) continue;

            if (isContagious[x] && canContagious[x] > 0 && !isContagious[y]) {
                canContagious[x]--;
                isContagious[y] = true;
            } else if (isContagious[y] && canContagious[y] > 0 && !isContagious[x]) {
                canContagious[y]--;
                isContagious[x] = true;
            } else if ((isContagious[x] && canContagious[x] > 0) || (isContagious[y] && canContagious[y] > 0)) {
                canContagious[x]--;
                canContagious[y]--;
            }
        }

        for (int i = 1; i <= N; i++) {
            if (isContagious[i]) System.out.print(1);
            else System.out.print(0);
        }
    }
}