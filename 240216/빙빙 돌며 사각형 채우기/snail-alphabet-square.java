import java.util.Scanner;

public class Main {

    // R, D, L, U
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        char[][] board = new char[N][M];
        board[0][0] = 'A';

        int curDir = 0;
        int curX = 0;
        int curY = 0;

        char curChar = 'B';
        for (int i = 2; i <= N * M; i++) {
            while (true) {
                int nx = curX + dx[curDir];
                int ny = curY + dy[curDir];

                if (isRange(N, M, nx, ny) && board[ny][nx] == 0) {
                    board[ny][nx] = curChar;
                    curX = nx;
                    curY = ny;

                    if (curChar == 'Z') curChar = 'A';
                    else curChar += 1;

                    break;
                } else {
                    curDir = (curDir + 1) % 4;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                System.out.printf("%s ", board[i][k]);
            }

            System.out.println();
        }
    }

    public static boolean isRange(int N, int M, int x, int y) {
        if (x >= 0 && x < M && y >= 0 && y < N) return true;

        return false;
    }
}