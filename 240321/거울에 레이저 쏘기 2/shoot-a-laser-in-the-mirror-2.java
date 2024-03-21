import java.util.*;

public class Main {

    // 우, 하, 좌, 상
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[][] board = new char[N + 1][N + 1];

        for (int n = 1; n <= N; n++) {
            char[] list = sc.next().toCharArray();

            for (int i = 1; i <= N; i++) {
                board[n][i] = list[i - 1];
            }
        }

        int K = sc.nextInt();

        int startX = 1;
        int startY = 1;
        
        int direc = 0;

        while (K-- > 1) {
            int nx = startX + dx[direc];
            int ny = startY + dy[direc];

            if (isRange(nx, ny, N)) {
                startX = nx;
                startY = ny;
            } else direc = turnDirec(direc);
        }

        direc = turnDirec(direc);

        int ans = 0;

        while (isRange(startX, startY, N)) {
            direc = reflect(direc, board[startY][startX]);

            startX += dx[direc];
            startY += dy[direc];
            ans++;
        }

        System.out.print(ans);
    }

    public static int reflect(int direc, char m) {
        if (direc == 0) { // 우로 갈때
            if (m == '/') return 3;
            else return 1;
        } else if (direc == 1) { // 하로 갈때
            if (m == '/') return 2;
            else return 0;
        } else if (direc == 2) { // 좌로 갈때
            if (m == '/') return 3;
            else return 1;
        } else { // 상 갈때
            if (m == '/') return 0;
            else return 2;
        }
    }

    public static int turnDirec(int direc) {
        return (direc + 1) % 4;
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 1 && x <= N && y >= 1 && y <= N) return true;

        return false;
    }
}