import java.util.Scanner;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 행 y
        int N = sc.nextInt();

        // 열 x
        int M = sc.nextInt();

        int[][] board = new int[N][M];

        int curNum = 2;
        int curDir = 0;

        int curX = 0;
        int curY = 0;

        board[0][0] = 1;
        while (curNum <= N * M) {
            int nx = curX + dx[curDir];
            int ny = curY + dy[curDir];

            if (isRange(N, M, nx, ny) && board[ny][nx] == 0) {
                board[ny][nx] = curNum++;

                curX = nx;
                curY = ny;
            } else curDir = (curDir + 1) % 4;
        }

        for (int i = 0; i < N; i++) {

            for (int k = 0; k < M; k++) {
                System.out.printf("%d ", board[i][k]);
            }

            System.out.println();
        }
    }

    public static boolean isRange(int N, int M, int x, int y) {
        if (x >= 0 && x < M && y >= 0 && y < N) return true;
        
        return false;
    }
}