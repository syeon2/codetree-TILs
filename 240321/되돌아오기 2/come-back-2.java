import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] cmd = sc.next().toCharArray();

        int cnt = 0;

        int curX = 0;
        int curY = 0;

        int direc = 0;

        for (int i = 0; i < cmd.length; i++) {
            char c = cmd[i];

            if (c == 'F') {
                curX += dx[direc];
                curY += dy[direc];
            } else direc = turnDirec(c, direc);

            cnt++;

            if (curX == 0 && curY == 0) break;
        }

        if (curX == 0 && curY == 0) System.out.print(cnt);
        else System.out.print(-1);
    }

    public static int turnDirec(char c, int direc) {
        if (c == 'R') return (direc + 1) % 4;
        else return (4 + (direc - 1)) % 4;
    }
}