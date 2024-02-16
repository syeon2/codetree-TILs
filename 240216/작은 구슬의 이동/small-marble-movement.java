import java.util.Scanner;

public class Main {

    public static int[] dx = {-1, 0, 0, 1};
    public static int[] dy = {0, -1, 1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();

        // r행
        int curY = sc.nextInt();
        // c열
        int curX = sc.nextInt();
        int direc = getDirec(sc.next().charAt(0));

        while (T-- > 0) {
            int nx = curX + dx[direc];
            int ny = curY + dy[direc];

            if (isRange(N, nx, ny)) {
                curX = nx;
                curY = ny;
            } else direc = 3 - direc;
        }

        System.out.printf("%d %d", curY, curX);
    }

    public static boolean isRange(int n, int x, int y) {
        if (x >= 1 && x <= n && y >= 1 && y <= n) return true;
        
        return false;
    }

    public static int getDirec(char c) {
        if (c == 'L') return 0;
        else if (c == 'D') return 1;
        else if (c == 'U') return 2;
        else return 3;
    }
}