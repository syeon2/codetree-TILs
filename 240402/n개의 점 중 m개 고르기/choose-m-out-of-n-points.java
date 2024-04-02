import java.util.*;

public class Main {

    public static int N;
    public static int M;

    public static int[][] posList;
    public static boolean[] isVisit;
    public static int[][] ansList;

    public static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        posList = new int[N][2];
        ansList = new int[2][2];
        isVisit = new boolean[N];

        for (int n = 0; n < N; n++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            posList[n][0] = x;
            posList[n][1] = y;
        }

        recur(0);

        System.out.print(ans);
    }

    public static void recur(int depth) {
        if (depth == 2) {
            int dist = 0;
            int x1 = ansList[0][0];
            int y1 = ansList[0][1];

            int x2 = ansList[1][0];
            int y2 = ansList[1][1];

            dist += (Math.abs(x1 - x2) * Math.abs(x1 - x2)) + (Math.abs(y1 - y2) * Math.abs(y1 - y2));

            ans = Math.min(ans, dist);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (isVisit[i]) continue;
            isVisit[i] = true;
            ansList[depth][0] = posList[i][0];
            ansList[depth][1] = posList[i][1];
            recur(depth + 1);
            isVisit[i] = false;
        }
    }
}