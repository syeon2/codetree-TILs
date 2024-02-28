import java.util.*;

public class Main {

    // W, N, S, E
    public static int[] dx = {-1, 0, 0, 1};
    public static int[] dy = {0, 1, -1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int curX = 0;
        int curY = 0;

        for (int n = 0; n < N; n++) {
            char direc = sc.next().charAt(0);
            int move = sc.nextInt();

            curX = curX + (dx[getDirecNum(direc)] * move);
            curY = curY + (dy[getDirecNum(direc)] * move);
        }

        System.out.printf("%d %d", curX, curY);
    }

    public static int getDirecNum(char direc) {
        if (direc == 'W') return 0;
        else if (direc == 'N') return 1;
        else if (direc == 'S') return 2;
        else return 3;
    }
}