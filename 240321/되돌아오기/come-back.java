import java.util.*;

public class Main {

    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int curX = 0;
        int curY = 0;

        int ans = 0;

        for (int n = 0; n < N; n++) {
            char direc = sc.next().charAt(0);
            int move = sc.nextInt();

            int direcNum = getDirecNum(direc);

            while (move-- > 0) {
                curX += dx[direcNum];
                curY += dy[direcNum];

                ans++;
                
                if (curX == 0 && curY == 0) break;
            }

            if (curX == 0 && curY == 0) break;
        }

        if (curX == 0 && curY == 0) System.out.print(ans);
        else System.out.print(-1);


    }

    public static int getDirecNum(char direc) {
        if (direc == 'N') return 0;
        else if (direc == 'S') return 1;
        else if (direc == 'W') return 2;
        else return 3;
    }
}