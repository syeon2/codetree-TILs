import java.util.Scanner;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] list = sc.next().toCharArray();

        int curX = 0;
        int curY = 0;

        int curDir = 0;
        int cnt = 0;

        boolean flag = false;

        for (int i = 0; i < list.length; i++) {
            if (list[i] == 'L') {
                curDir = (4 + (curDir - 1)) % 4;
                cnt++;
            } else if (list[i] == 'R') {
                curDir = (curDir + 1) % 4;
                cnt++;
            } else {
                curX += dx[curDir];
                curY += dy[curDir];
                cnt++;

                if (curX == 0 && curY == 0) {
                    flag = true;
                    break;
                }
            }
        }

        if (flag) System.out.print(cnt);
        else System.out.print(-1);
    }
}