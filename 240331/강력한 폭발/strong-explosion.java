import java.util.*;

public class Main {

    public static int N;
    public static int[][] board;
    public static int[][] memo;

    public static int[][] dx = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, -1}, {0, 1, 1, -1, -1}};
    public static int[][] dy = {{0, -2, -1, 1, 2}, {0, -1, 0, 1, 0}, {0, -1, 1, 1, -1}};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        board = new int[N][N];
        memo = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int ans = recur();

        System.out.print(ans);
    }

    public static int recur() {
        int sum = 0;

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                if (memo[i][k] >= 1) sum++;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                if (board[i][k] == 0) continue;

                board[i][k] = 0;

                for (int j = 0; j < 3; j++) {
                    for (int l = 0; l < 5; l++) {
                        int nx = k + dx[j][l];
                        int ny = i + dy[j][l];

                        if (isRange(nx, ny)) memo[ny][nx]++;
                    }

                    sum = Math.max(sum, recur());

                    for (int l = 0; l < 5; l++) {
                        int nx = k + dx[j][l];
                        int ny = i + dy[j][l];

                        if (isRange(nx, ny)) memo[ny][nx]--;
                    }
                }

                board[i][k] = 1;
            }
        }

        return sum;
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}