import java.util.*;

public class Main {

    // 북, 동, 남, 서
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] cmd = sc.next().toCharArray();

        int curX = 0;
        int curY = 0;

        int curPos = 0;

        for (int i = 0; i < cmd.length; i++) {
            if (cmd[i] == 'L') {
                curPos = turnLeft(curPos);
            } else if (cmd[i] == 'R') {
                curPos = turnRight(curPos);
            } else {
                curX = curX + dx[curPos];
                curY = curY + dy[curPos];
            }
        }

        System.out.printf("%d %d", curX, curY);
    }

    public static int turnRight(int curDirec) {
        return (curDirec + 1) % 4;
    }

    public static int turnLeft(int curDirec) {
        return (4 + (curDirec - 1)) % 4;
    }
}