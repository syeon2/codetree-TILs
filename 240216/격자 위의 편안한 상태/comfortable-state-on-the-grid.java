import java.util.Scanner;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] board = new int[N][N];

        for (int m = 0; m < M; m++) {

            // y 행
            int r = sc.nextInt() - 1;
            // x 열
            int c = sc.nextInt() - 1;

            board[r][c] = 1;

            int temp = 0;

            for (int i = 0; i < 4; i++) {
                int nx = c + dx[i];
                int ny = r + dy[i];

                if (isRange(N, nx, ny) && board[ny][nx] == 1) temp++;
            }

            if (temp == 3) System.out.println(1);
            else System.out.println(0);
        }
    }

    public static boolean isRange(int N, int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;
        
        return false;
    }
}