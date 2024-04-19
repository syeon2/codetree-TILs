import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int C;

    public static int[][] board;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        C = sc.nextInt();

        board = new int[N][N];
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        for (int r1 = 0; r1 < N; r1++) {
            for (int c1 = 0; c1 <= N - M; c1++) {

                for (int r2 = 0; r2 < N; r2++) {
                    for (int c2 = 0; c2 <= N - M; c2++) {

                        if (!isCrossed(c1, r1, c2, r2)) continue;

                        renewAns(c1, r1, c2, r2);
                    }
                }
            }
        }

        System.out.print(ans);
    }

    public static int perm(int[] list, int depth, int totalWeight, int totalValue) {
        if (list.length == depth) {
            if (totalWeight <= C) return totalValue;
            else return 0;
        }

        int case1 = perm(list, depth + 1, totalWeight, totalValue);
        int case2 = perm(list, depth + 1, totalWeight + list[depth], totalValue + (list[depth] * list[depth]));

        return Math.max(case1, case2);
    }

    public static void renewAns(int x1, int y1, int x2, int y2) {
        int[] temp1 = new int[M];
        for (int i = x1; i < x1 + M; i++) {
            temp1[i - x1] = board[y1][i];
        }

        int value1 = perm(temp1, 0, 0, 0);

        int[] temp2 = new int[M];
        for (int i = x2; i < x2 + M; i++) {
            temp2[i - x2] = board[y2][i];
        }

        int value2 = perm(temp2, 0, 0, 0);

        ans = Math.max(ans, value1 + value2);
    }

    public static boolean isCrossed(int x1, int y1, int x2, int y2) {
        if (y1 != y2) return true;

        int s1 = x1;
        int e1 = x1 + M - 1;

        int s2 = x2;
        int e2 = x2 + M - 1;

        if ((s1 <= s2 && e1 >= s2) ||
            (s1 <= e2 && e1 >= e2) ||
            (s2 <= s1 && e2 >= s1) ||
            (s2 <= e1 && e2 >= e1)) return false;

        return true;
    }
}