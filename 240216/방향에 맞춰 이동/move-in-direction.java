import java.util.Scanner;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int curX = 0;
        int curY = 0;

        for (int n = 0; n < N; n++) {
            char c = sc.next().charAt(0);
            int move = sc.nextInt();

            while (move-- > 0) {
                curX += dx[getDirectionIdx(c)];
                curY += dy[getDirectionIdx(c)];
            }
        }

        System.out.printf("%d %d", curX, curY);
    }

    public static int getDirectionIdx(char c) {
        if (c == 'E') return 0;
        else if (c == 'N') return 1;
        else if (c == 'W') return 2;
        else return 3;
    }
}