import java.util.*;

public class Main {

    // U, R, D, L
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] cmd = sc.next().toCharArray();

        int curX = 0;
        int curY = 0;

        int curDirec = 0;

        int ans = 0;

        for (int i = 0; i < cmd.length; i++) {
            if (cmd[i] == 'R') {
                curDirec = turnRight(curDirec);
            } else if (cmd[i] == 'L') {
                curDirec = turnLeft(curDirec);
            } else {
                int nx = curX + dx[curDirec];
                int ny = curY + dy[curDirec];

                curX = nx;
                curY = ny;
            }

            ans++;

            if (curX == 0 && curY == 0) break;
        }

        if (curX == 0 && curY == 0) System.out.print(ans);
        else System.out.print(-1);        
    }

    public static int turnRight(int curDirec) {
        return (curDirec + 1) % 4;
    }

    public static int turnLeft(int curDirec) {
        return (4 - (curDirec + 1)) % 4;
    }
}