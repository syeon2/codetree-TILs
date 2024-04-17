import java.util.*;

public class Main {

    public static int[] dx = {1, 0, 0, -1};
    public static int[] dy = {0, 1, -1, 0};

    public static int N;
    public static int M;
    public static int T;
    public static int K;

    public static List<Marble> board = new ArrayList<>();
    public static PriorityQueue<Marble>[][] marbleCnt;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        T = sc.nextInt();
        K = sc.nextInt();

        marbleCnt = new PriorityQueue[N][N];

        for (int m = 0; m < M; m++) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;

            int direc = getDirec(sc.next().charAt(0));
            int speed = sc.nextInt();

            board.add(new Marble(c, r, direc, speed, m + 1));
        }

        while (T-- > 0) {
            marbleCntInit();
            simulate();
            checkCollidAndRemove();
        }

        System.out.print(board.size());
    }

    public static void checkCollidAndRemove() {
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {

                PriorityQueue<Marble> que = marbleCnt[r][c];

                while (que.size() > K) {
                    Marble marble = que.remove();
                    marble.isCrashed = true;
                }
            }
        }

        int idx = 0;
        while (idx < board.size()) {
            Marble marble = board.get(idx);

            if (marble.isCrashed) board.remove(idx);
            else idx++;
        }
    }

    public static void marbleCntInit() {
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                marbleCnt[r][c] = new PriorityQueue<>((a, b) -> {
                    if (a.speed == b.speed) {
                        return a.order - b.order;
                    }

                    return a.speed - b.speed;
                });
            }
        }
    }

    public static void simulate() {
        for (int i = 0; i < board.size(); i++) {
            Marble marble = board.get(i);

            int curX = marble.x;
            int curY = marble.y;
            int curSpeed = marble.speed;
            int curDirec = marble.direc;

            while (curSpeed-- > 0) {
                int nx = curX + dx[curDirec];
                int ny = curY + dy[curDirec];

                if (isRange(nx, ny)) {
                    curX = nx;
                    curY = ny;
                } else {
                    curDirec = turnDirec(curDirec);
                    curSpeed++;
                }
            }

            marble.x = curX;
            marble.y = curY;
            marble.direc = curDirec;

            marbleCnt[curY][curX].add(marble);
        }
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static int turnDirec(int direc) {
        return 3 - direc;
    }

    public static int getDirec(char direc) {
        if (direc == 'R') return 0;
        else if (direc == 'L') return 3;
        else if (direc == 'U') return 2;
        else return 1;
    }

    public static class Marble {
        public int x;
        public int y;
        public int direc;
        public int speed;
        public int order;
        public boolean isCrashed = false;

        public Marble(int x, int y, int direc, int speed, int order) {
            this.x = x;
            this.y = y;
            this.direc = direc;
            this.speed = speed;
            this.order = order;
        }
    }
}