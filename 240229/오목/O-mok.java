import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    public static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};

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
        int ansX = 0;
        int ansY = 0;

        for (int i = 1; i < 20; i++) {

            for (int k = 1; k < 20; k++) {

                for (int j = 0; j < 8; j++) {

                    int stone = board[i][k];
                    int curX = k;
                    int curY = i;

                    int middleX = 0;
                    int middleY = 0;

                    int cnt = 1;

                    for (int l = 1; l < 5; l++) {
                        int nx = curX + dx[j];
                        int ny = curY + dy[j];

                        if (isRange(nx, ny) && board[ny][nx] == stone) {
                            curX = nx;
                            curY = ny;
                            cnt++;

                            if (l == 2) {
                                middleX = nx;
                                middleY = ny;
                            }
                        } else break;
                    }

                    if (cnt == 5) {
                        ans = stone;
                        ansX = middleX;
                        ansY = middleY;
                        break;
                    }
                }

                if (ans != 0) break;
            }

            if (ans != 0) break;
        }

        if (ans == 0) System.out.print(ans);
        else {
            System.out.printf("%d\n%d %d", ans, ansY, ansX);
        }
    }

    public static boolean isRange(int x, int y) {
        if (x >= 1 && x < 20 && y >= 1 && y < 20) return true;

        return false;
    }
}