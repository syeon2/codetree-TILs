import java.util.*;

public class Main {

    public static int[][] pos = new int[10][2];
    public static int startX;
    public static int startY;

    public static int endX;
    public static int endY;

    public static int[] ansList = new int[3];

    public static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            char[] list = sc.next().toCharArray();

            for (int k = 0; k < N; k++) {
                if (list[k] >= '1' && list[k] <= '9') {
                    int num = list[k] - '0';

                    pos[num][0] = k;
                    pos[num][1] = i;
                } else if (list[k] == 'S') {
                    startX = k;
                    startY = i;
                } else if (list[k] == 'E') {
                    endX = k;
                    endY = i;
                }
            }
        }

        recur(0, 0);

        if (ans == Integer.MAX_VALUE) System.out.print(-1);
        else System.out.print(ans);
    }

    public static void recur(int idx, int depth) {
        if (depth == 3) {
            int dist = 0;

            for (int i = 0; i < 3; i++) {
                if (ansList[i] == 0) return;

                if (i == 0) {
                    dist += Math.abs(startX - pos[ansList[i]][0]) + Math.abs(startY - pos[ansList[i]][1]);
                } else dist += Math.abs(pos[ansList[i - 1]][0] - pos[ansList[i]][0]) + Math.abs(pos[ansList[i - 1]][1] - pos[ansList[i]][1]);
            }

            dist += Math.abs(endX - pos[ansList[2]][0]) + Math.abs(endY - pos[ansList[2]][1]);

            ans = Math.min(ans, dist);
            return;
        }

        for (int i = idx; i <= 9; i++) {
            if (pos[i][0] == 0 && pos[i][1] == 0) continue;

            ansList[depth] = i;
            recur(i + 1, depth + 1);
        }
    }
}