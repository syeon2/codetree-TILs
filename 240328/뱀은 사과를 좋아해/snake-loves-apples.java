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

        Deque<Snake> que = new LinkedList<>();
        que.addFirst(new Snake(0, 0));

        int ans = 0;

        boolean isEnd = false;

        for (int n = 0; n < K; n++) {
            int direc = getDirec(sc.next().charAt(0));
            int move = sc.nextInt();

            while (move-- > 0) {
                Snake s = que.peekFirst();

                int nx = s.x + dx[direc];
                int ny = s.y + dy[direc];

                if (isRange(nx, ny, N)) {
                    que.addFirst(new Snake(nx, ny));

                    if (appleBoard[ny][nx] != 1) que.removeLast();
                    else appleBoard[ny][nx] = 0;
                } else {
                    isEnd = true;
                    ans++;
                    break;
                }

                int[][] board = new int[N][N];
                int size = que.size();
                while (size-- > 0) {
                    Snake snake = que.removeFirst();

                    int nx2 = snake.x;
                    int ny2 = snake.y;

                    if (board[ny2][nx2] == 1) {
                        isEnd = true;
                        break;
                    } else board[ny2][nx2] = 1;

                    que.addLast(snake);
                }

                ans++;

                if (isEnd) break;
            }

            if (isEnd) break;
        }

        System.out.print(ans);
    }

    public static int getDirec(char direc) {
        if (direc == 'U') return 0;
        else if (direc == 'D') return 1;
        else if (direc == 'L') return 2;
        else return 3;
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static class Snake {
        public int x;
        public int y;

        public Snake(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}