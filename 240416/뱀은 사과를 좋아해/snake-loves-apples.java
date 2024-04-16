import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int N;
    public static int M;
    public static int K;

    public static int[][] board;

    public static Deque<Snake> deque = new LinkedList<>();

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();

        board = new int[N][N];

        while (M-- > 0) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;

            board[r][c] = 1;
        }

        deque.addFirst(new Snake(0, 0));
        board[0][0] = 2;

        boolean isEnd = false;

        int curX = 0;
        int curY = 0;

        while (K-- > 0 && !isEnd) {
            int direc = getDirec(sc.next().charAt(0));
            int cnt = sc.nextInt();

            while (cnt-- > 0) {
                int nx = curX + dx[direc];
                int ny = curY + dy[direc];

                if (isRange(nx, ny)) {
                    if (board[ny][nx] == 0 || (board[ny][nx] == 2 && deque.peekLast().x == nx && deque.peekLast().y == ny)) {
                        Snake removeBody = deque.removeLast();
                        board[removeBody.y][removeBody.x] = 0;

                        deque.addFirst(new Snake(nx, ny));
                        board[ny][nx] = 2;

                        curX = nx;
                        curY = ny;

                        ans++;
                    } else if (board[ny][nx] == 1) {
                        deque.addFirst(new Snake(nx, ny));
                        board[ny][nx] = 2;

                        curX = nx;
                        curY = ny;

                        ans++;
                    } else {
                        ans++;
                        isEnd = true;

                        break;
                    }
                } else {
                    ans++;
                    isEnd = true;

                    break;
                }
            }
        }

        System.out.print(ans);
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static int getDirec(char c) {
        if (c == 'R') return 0;
        else if (c == 'D') return 1;
        else if (c == 'L') return 2;
        else return 3;
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