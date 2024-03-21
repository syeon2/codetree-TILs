import java.util.*;

public class Main {

    public static int[] dx = {-1, 0, 1, 1};
    public static int[] dy = {1, 1, 1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[20][20];
        for (int i = 1; i < 20; i++) {
            for (int k = 1; k < 20; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int ans = 0;
        int middleX = 0;
        int middleY = 0;

        for (int i = 1; i < 20; i++) {
            for (int k = 1; k < 20; k++) {
                if (board[i][k] == 0) continue;

                for (int j = 0; j < 4; j++) {
                    int x = k;
                    int y = i;

                    int cnt = 4;

                    int tempMiddleX = 0;
                    int tempMiddleY = 0;

                    while (cnt > 0) {
                        int nx = x + dx[j];
                        int ny = y + dy[j];

                        if (!isRange(nx, ny) || board[ny][nx] != board[i][k]) break;
                        cnt--;
                        x = nx;
                        y = ny;

                        if (cnt == 2) {
                            tempMiddleX = nx;
                            tempMiddleY = ny;
                        }
                    }

                    if (cnt == 0) {
                        ans = board[i][k];
                        middleX = tempMiddleX;
                        middleY = tempMiddleY;
                        break;
                    }
                }

                if (ans != 0) break;
            }

            if (ans != 0) break;
        }

        if (ans != 0) System.out.printf("%d\n%d %d", ans, middleY, middleX);
        else System.out.print(ans);
    }

    public static boolean isRange(int x, int y) {
        if (x >= 1 && x < 20 && y >= 1 && y < 20) return true;

        return false;
    }
}