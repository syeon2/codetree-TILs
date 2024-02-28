import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[] color = new int[200001];
        int[] blackList = new int[200001];
        int[] whiteList = new int[200001];

        int curPos = 100000;

        for (int t = 0; t < T; t++) {
            int num = sc.nextInt();
            char direc = sc.next().charAt(0);

            if (direc == 'R') {
                for (int i = curPos; i < curPos + num; i++) {
                    if (color[i] == 3) continue;

                    color[i] = 1;
                    blackList[i]++;

                    if (blackList[i] >= 2 && whiteList[i] >= 2) color[i] = 3;
                }

                curPos += (num - 1);
            } else {
                for (int i = curPos; i > curPos - num; i--) {
                    if (color[i] == 3) continue;

                    color[i] = 2;
                    whiteList[i]++;

                    if (blackList[i] >= 2 && whiteList[i] >= 2) color[i] = 3;
                }

                curPos -= (num - 1);
            }
        }

        int bCnt = 0;
        int wCnt = 0;
        int gCnt = 0;

        for (int i = 0; i < color.length; i++) {
            if (color[i] == 1) bCnt++;
            else if (color[i] == 2) wCnt++;
            else if (color[i] == 3) gCnt++;
        }

        System.out.printf("%d %d %d", wCnt, bCnt, gCnt);
    }
}