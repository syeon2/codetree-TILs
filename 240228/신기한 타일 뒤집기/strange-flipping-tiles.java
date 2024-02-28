import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] color = new int[200001];

        int curPos = 100000;

        for (int t = 0; t < T; t++) {
            int move = sc.nextInt();
            char direc = sc.next().charAt(0);

            if (direc == 'R') {
                for (int i = curPos; i < curPos + move; i++) {
                    color[i] = 1;
                }

                curPos += (move - 1);
            } else {
                for (int i = curPos; i > curPos - move; i--) {
                    color[i] = 2;
                }

                curPos -= (move - 1);
            }
        }

        int wCnt = 0;
        int bCnt = 0;
        for (int i = 0; i < color.length; i++) {
            if (color[i] == 1) bCnt++;
            else if (color[i] == 2) wCnt++;
        }

        System.out.printf("%d %d", wCnt, bCnt);
    }
}