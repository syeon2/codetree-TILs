import java.util.*;

public class Main {

    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();
        int K = sc.nextInt();

        HashMap<String, List<Ball>> board = new HashMap<>();

        for (int i = 0; i < M; i++) {
            int R = sc.nextInt();
            int C = sc.nextInt();

            int direc = getDirec(sc.next().charAt(0));
            int speed = sc.nextInt();

            String key = makeKey(C, R);

            board.put(key, new ArrayList());
            board.get(key).add(new Ball(speed, direc));
        }

        while (T-- > 0) {
            HashMap<String, List<Ball>> copy = new HashMap<>();

            for (String key : board.keySet()) {
                List<Ball> list = board.get(key);

                int[] pos = parseKey(key);

                int x = pos[0];
                int y = pos[1];

                for (int i = 0; i < list.size(); i++) {
                    Ball ball = list.get(i);

                    int direc = ball.direc;
                    int speed = ball.speed;

                    int curX = x;
                    int curY = y;

                    while (speed-- > 0) {
                        int nx = curX + dx[direc];
                        int ny = curY + dy[direc];

                        if (isRange(nx, ny, N)) {
                            curX = nx;
                            curY = ny;
                        } else {
                            direc = turnDirec(direc);
                            speed++;
                        }
                    }

                    String posKey = makeKey(curX, curY);
                    if (copy.get(posKey) == null) {
                        copy.put(posKey, new ArrayList());
                    }
                    copy.get(posKey).add(new Ball(speed, direc));
                }
            }

            for (String key : copy.keySet()) {
                List<Ball> list = copy.get(key);

                while (list.size() > K) {
                    int minIdx = -1;
                    int minValue = 10000;

                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).speed < minValue) {
                            minValue = list.get(i).speed;
                            minIdx = i;
                        }
                    }

                    list.remove(minIdx);
                }
            }

            board = copy;
        }

        int ans = 0;
        for (String key : board.keySet()) {
            ans += board.get(key).size();
        }

        System.out.println(ans);
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 1 && x <= N && y >= 1 && y <= N) return true;

        return false;
    }

    public static int turnDirec(int direc) {
        if (direc == 0) return 1;
        else if (direc == 1) return 0;
        else if (direc == 2) return 3;
        else return 2;
    }

    public static int[] parseKey(String key) {
        StringTokenizer st = new StringTokenizer(key);

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int[] pos = new int[2];
        pos[0] = x;
        pos[1] = y;

        return pos;
    }

    public static String makeKey(int x, int y) {
        StringBuilder sb = new StringBuilder();

        sb.append(x).append(" ").append(y);
        return sb.toString();
    }

    public static int getDirec(char direc) {
        if (direc == 'U') return 0;
        else if (direc == 'D') return 1;
        else if (direc == 'L') return 2;
        else return 3;
    }

    public static class Ball {
        public int speed;
        public int direc;

        public Ball(int speed, int direc) {
            this.speed = speed;
            this.direc = direc;
        }
    }
}