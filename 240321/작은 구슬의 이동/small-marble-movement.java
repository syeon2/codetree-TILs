import java.util.*;

public class Main {

    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();

        int[][] board = new int[N + 1][N + 1];

        int y = sc.nextInt();
        int x = sc.nextInt();

        int curDirec = getDirecNum(sc.next().charAt(0));

        while (T-- > 0) {
            int nx = x + dx[curDirec];
            int ny = y + dy[curDirec];

            if (isRange(nx, ny, N)) {
                x = nx;
                y = ny;
            } else curDirec = turnDirec(curDirec);
        }

        System.out.printf("%d %d", y, x);
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 1 && x <= N && y >= 1 && y <= N) return true;

        return false;
    }

    public static int getDirecNum(char direc) {
        if (direc == 'U') return 0;
        else if (direc == 'D') return 1;
        else if (direc == 'R') return 3;
        else return 2;
    }

    public static int turnDirec(int direc) {
        if (direc == 0) return 1;
        else if (direc == 1) return 0;
        else if (direc == 2) return 3;
        else return 2;
    }
}