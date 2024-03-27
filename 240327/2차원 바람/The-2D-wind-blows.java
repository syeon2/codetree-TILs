import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int[] aroundX = {0, 0, -1, 1};
    public static int[] aroundY = {-1, 1, 0, 0};

    public static int[][] board;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();

        board = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        while (Q-- > 0) {
            int y1 = sc.nextInt() - 1;
            int x1 = sc.nextInt() - 1;

            int y2 = sc.nextInt() - 1;
            int x2 = sc.nextInt() - 1;

            int curX = x1;
            int curY = y1;

            int curDirec = 0;
            int prevValue = board[curY][curX];

            while (true) {
                int nx = curX + dx[curDirec];
                int ny = curY + dy[curDirec];

                if (isRange(nx, ny, x1, x2, y1, y2)) {
                    int temp = board[ny][nx];
                    board[ny][nx] = prevValue;
                    prevValue = temp;

                    curX = nx;
                    curY = ny;
                } else curDirec = turnDirec(curDirec);

                if (nx == x1 && ny == y1) break;
            }

            int[][] tempBoard = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int k = 0; k < M; k++) {
                    tempBoard[i][k] = board[i][k];
                }
            }

            for (int i = y1; i <= y2; i++) {
                for (int k = x1; k <= x2; k++) {

                    int sum = tempBoard[i][k];
                    int cnt = 1;

                    for (int j = 0; j < 4; j++) {
                        int nx = k + aroundX[j];
                        int ny = i + aroundY[j];

                        if (isRange2(nx, ny, M, N)) {
                            sum += tempBoard[ny][nx];
                            cnt++;
                        }
                    }

                    int avg = sum / cnt;

                    board[i][k] = avg;
                }
            }

            for (int i = 0; i < N; i++) {
                for (int k = 0; k < M; k++) {
                    System.out.printf("%d ", board[i][k]);
                }

                System.out.println();
            }
        }
    }

    public static boolean isRange2(int x, int y, int X, int Y) {
        if (x >= 0 && x < X && y >= 0 && y < Y) return true;

        return false;
    }

    public static int turnDirec(int direc) {
        return (direc + 1) % 4;
    }

    public static boolean isRange(int x, int y, int minX, int maxX, int minY, int maxY) {
        if (x >= minX && x <= maxX && y >= minY && y <= maxY) return true;

        return false;
    }
}