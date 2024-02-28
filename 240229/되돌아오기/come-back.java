import java.util.*;

public class Main {

    // W, S, N, E
    public static int[] dx = {-1, 0, 0, 1};
    public static int[] dy = {0, 1, -1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int curX = 0;
        int curY = 0;

        int time = 0;

        for (int n = 0; n < N; n++) {
            char direc = sc.next().charAt(0);
            int move = sc.nextInt();

            for (int i = 0; i < move; i++) {
                int nx = curX + dx[getDirec(direc)];
                int ny = curY + dy[getDirec(direc)];

                time++;
                curX = nx;
                curY = ny;

                if (curX == 0 && curY == 0) break;
            }

            if (curX == 0 && curY == 0) break;
        }

        if (curX == 0 && curY == 0) System.out.print(time);
        else System.out.print(-1);
    }

    public static int getDirec(char direc) {
        if (direc == 'W') return 0;
        else if (direc == 'S') return 1;
        else if (direc == 'N') return 2;
        else return 3;
    }
}