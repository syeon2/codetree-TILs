import java.util.*;

public class Main {

    public static int[] dx = {1, 0, 0, -1};
    public static int[] dy = {0, 1, -1, 0};

    public static int N;
    public static int M;
    public static int T;

    public static List<Marble> list = new ArrayList<>();
    public static Queue<Marble>[][] board;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        T = sc.nextInt();
        board = new LinkedList[N][N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                board[r][c] = new LinkedList<>();
            }
        }

        for (int m = 0; m < M; m++) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;

            int direc = getDirec(sc.next().charAt(0));
            int w = sc.nextInt();

            list.add(new Marble(c, r, direc, w, m + 1));
        }

        while (T-- > 0) {
            simulate();

            checkAndMerge();
        }

        int ans = 0;
        for (int i = 0; i < list.size(); i++) {
            ans = Math.max(list.get(i).w, ans);
        }

        System.out.printf("%d %d", list.size(), ans);
    }

    public static void checkAndMerge() {
        List<Marble> temp = new ArrayList<>();

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (board[r][c].size() > 1) {

                    int sumWeight = 0;
                    int curDirec = -1;
                    int maxOrder = 0;

                    Queue<Marble> pos = board[r][c];

                    while (!pos.isEmpty()) {
                        Marble removedMarble = pos.remove();

                        sumWeight += removedMarble.w;

                        if (maxOrder < removedMarble.order) {
                            maxOrder = removedMarble.order;
                            curDirec = removedMarble.direc;
                        }
                    }

                    temp.add(new Marble(c, r, curDirec, sumWeight, maxOrder));
                } else if (board[r][c].size() == 1) {
                    temp.add(board[r][c].remove());
                }
            }
        }

        list = temp;
    }

    public static void simulate() {
        for (int i = 0; i < list.size(); i++) {
            Marble marble = list.get(i);

            int curX = marble.x;
            int curY = marble.y;
            int curDirec = marble.direc;

            int nx = curX + dx[curDirec];
            int ny = curY + dy[curDirec];

            if (isRange(nx, ny)) {
                curX = nx;
                curY = ny;
            } else marble.direc = turnDirec(curDirec);

            marble.x = curX;
            marble.y = curY;

            board[curY][curX].add(marble);
        }
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static class Marble {
        public int x;
        public int y;
        public int direc;
        public int w;
        public int order;

        public Marble(int x, int y, int direc, int w, int order) {
            this.x = x;
            this.y = y;
            this.direc = direc;
            this.w = w;
            this.order = order;
        }
    }

    public static int turnDirec(int direc) {
        return 3 - direc;
    }

    public static int getDirec(char direc) {
        if (direc == 'R') return 0;
        else if (direc == 'D') return 1;
        else if (direc == 'L') return 3;
        else return 2;
    }
}