import java.util.*;

public class Main {

    // U, D, R, L
    public static int[] dx = {0, 0, 1, -1};
    public static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        // r == y, c == x
        int r = sc.nextInt();
        int c = sc.nextInt();

        char direc = sc.next().charAt(0);
        int curDirec = getDirecNum(direc);

        while (true) {
            if (t == 0) break;

            t--;

            int nx = c + dx[curDirec];
            int ny = r + dy[curDirec];

            if (isRange(nx, ny, n)) {
                c = nx;
                r = ny;
            } else {
                curDirec = turnReverse(curDirec);
            }
        }

        System.out.printf("%d %d", r, c);
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 1 && x <= N && y >= 1 && y <= N) return true;

        return false;
    }

    public static int getDirecNum(char direc) {
        if (direc == 'U') return 0;
        else if (direc == 'D') return 1;
        else if (direc == 'R') return 2;
        else return 3;
    }

    public static int turnReverse(int direc) {
        if (direc == 0) return 1;
        else if (direc == 1) return 0;
        else if (direc == 2) return 3;
        else return 2;
    }
}