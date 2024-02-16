import java.util.Scanner;

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

        int cnt = 0;

        boolean flag = false;

        for (int n = 0; n < N; n++) {
            char c = sc.next().charAt(0);
            int move = sc.nextInt();

            int curDir = getDirIdx(c);

            while (move-- > 0) {
                curX += dx[curDir];
                curY += dy[curDir];
                cnt++;

                if (curX == 0 && curY == 0) break;    
            }

            if (curX == 0 && curY == 0) {
                flag = true;
                break;
            }
        }

        if (flag) System.out.print(cnt);
        else System.out.print(-1);
    }

    public static int getDirIdx(char c) {
        if (c == 'W') return 0;
        else if (c == 'S') return 1;
        else if (c == 'N') return 2;
        else return 3;
    }
}