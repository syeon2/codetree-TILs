import java.util.*;

public class Main {

    public static int N;
    public static int M;

    public static int[][] posList;
    public static int[][] ansList;

    public static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        posList = new int[N][2];
        ansList = new int[M][2];

        for (int n = 0; n < N; n++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            posList[n][0] = x;
            posList[n][1] = y;
        }

        recur(0, 0);

        System.out.print(ans);
    }

    public static void check() {
        int dist = 0;

        for (int i = 0; i < M; i++) {
            int x1 = ansList[i][0];
            int y1 = ansList[i][1];

            for (int k = i + 1; k < M; k++) {
                int x2 = ansList[k][0];
                int y2 = ansList[k][1];

                int temp = (Math.abs(x1 - x2) * Math.abs(x1 - x2)) + (Math.abs(y1 - y2) * Math.abs(y1 - y2));

                dist = Math.max(dist, temp);
            }
        }

        ans = Math.min(ans, dist);
    }

    public static void recur(int idx, int depth) {
        if (depth == M) {
            check();
            return;
        }

        if (idx == N) return;

        recur(idx + 1, depth);
        ansList[depth][0] = posList[idx][0];
        ansList[depth][1] = posList[idx][1];
        recur(idx + 1, depth + 1);
    }
}