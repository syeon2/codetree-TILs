import java.util.Scanner;

public class Main {

    // N, E, S, W
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static int curDirection = 0;
    public static int x = 0;
    public static int y = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] command = sc.next().toCharArray();

        for (int i = 0; i < command.length; i++) {
            char c = command[i];

            if (c == 'F') {
                x += dx[curDirection];
                y += dy[curDirection];
            } else {
                if (c == 'R') curDirection = changeR();
                else curDirection = changeL();
            }
        }

        System.out.printf("%d %d", x, y);
    }

    public static int changeR() {
        return (curDirection + 1) % 4;
    }

    public static int changeL() {
        if (curDirection == 0) return 3;
        else return (curDirection - 1) % 4;
    }
}