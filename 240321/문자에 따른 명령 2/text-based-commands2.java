import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.next().toCharArray();

        int curX = 0;
        int curY = 0;

        int curDirec = 0;

        for (int i = 0; i < arr.length; i++) {
            char direc = arr[i];

            if (direc == 'F') {
                curX += dx[curDirec];
                curY += dy[curDirec];
            } else curDirec = turnDirec(direc, curDirec);
        }

        System.out.printf("%d %d", curX, curY);
    }

    public static int turnDirec(char direc, int curDirec) {
        if (direc == 'R') return (curDirec + 1) % 4;
        else return (4 + (curDirec - 1)) % 4;
    }
}