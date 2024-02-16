import java.util.Scanner;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] list = sc.next().toCharArray();

        int curX = 0;
        int curY = 0;

        // 0 북, 1 동, 2 서, 3 남
        int curDirec = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] == 'L') {
                curDirec = (4 + (curDirec - 1)) % 4;
            } else if (list[i] == 'R') {
                curDirec = (4 + (curDirec + 1)) % 4;
            } else {
                curX += dx[curDirec];
                curY += dy[curDirec];
            }
        }

        System.out.printf("%d %d", curX, curY);
    }
}