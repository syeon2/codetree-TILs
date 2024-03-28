import java.util.*;

public class Main {

    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int[][] appleBoard = new int[N][N];
        for (int i = 0; i < M; i++) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;

            appleBoard[r][c] = 1;
        }

        boolean[][] board = new boolean[N][N];
        int[][] direcBoard = new int[N][N];
        board[0][0] = true;

        int ans = 0;
        int headX = 0;
        int headY = 0;
        int tailX = 0;
        int tailY = 0;

        int body = 1;

        boolean isEnd = false;

        for (int n = 0; n < K; n++) {
            int direc = getDirec(sc.next().charAt(0));
            int move = sc.nextInt();

            while (move-- > 0) {
                ans++;
                
                int nx = headX + dx[direc];
                int ny = headY + dy[direc];

                if (!isRange(nx, ny, N)) break;

                if (appleBoard[ny][nx] == 1) {
                    appleBoard[ny][nx] = 0;
                    body++;
                } else {
                    if (body == 1) {
                        board[tailY][tailX] = false;
                    } else if (body == 2) {
                        board[tailY][tailX] = false;
                        direcBoard[tailY][tailX] = 0;
                        tailX = headX;
                        tailY = headY;
                    } else {
                        int nextDirec = direcBoard[tailY][tailX];

                        int tx = tailX + dx[nextDirec];
                        int ty = tailY + dy[nextDirec];

                        direcBoard[tailY][tailX] = 0;
                        board[tailY][tailX] = false;

                        tailX = tx;
                        tailY = ty;
                    }
                }

                if (isRange(nx, ny, N) && !board[ny][nx]) {
                    board[ny][nx] = true;
                    direcBoard[headY][headX] = direc;

                    headX = nx;
                    headY = ny;

                    if (body == 1) {
                        tailX = headX;
                        tailY = headY;
                    }
                } else {
                    isEnd = true;
                    break;
                }
            }

            if (isEnd) break;
        }

        System.out.print(ans);
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static int getDirec(char c) {
        if (c == 'U') return 0;
        else if (c == 'D') return 1;
        else if (c == 'L') return 2;
        else return 3;
    }
}