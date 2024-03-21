import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int OFFSET = 100000;
        int[] line = new int[100001 + OFFSET];
        int[] whiteMemo = new int[100001 + OFFSET];
        int[] blackMemo = new int[100001 + OFFSET];

        int curPos = OFFSET;

        for (int n = 0; n < N; n++) {
            int move = sc.nextInt();
            char direc = sc.next().charAt(0);

            if (direc == 'R') {
                int start = curPos;
                int end = curPos + move - 1;

                for (int i = start; i <= end; i++) {
                    if (line[i] != 3) {
                        line[i] = 1;
                        blackMemo[i]++;

                        if (blackMemo[i] >= 2 && whiteMemo[i] >= 2) line[i] = 3;
                    }
                }

                curPos = end;
            } else {
                int start = curPos;
                int end = curPos - move + 1;

                for (int i = start; i >= end; i--) {
                    if (line[i] != 3) {
                        line[i] = 2;
                        whiteMemo[i]++;

                        if (blackMemo[i] >= 2 && whiteMemo[i] >= 2) line[i] = 3;
                    }
                }

                curPos = end;
            }
        }

        int bCnt = 0;
        int wCnt = 0;
        int gCnt = 0;

        for (int i = 0; i < line.length; i++) {
            if (line[i] == 1) bCnt++;
            else if (line[i] == 2) wCnt++;
            else if (line[i] == 3) gCnt++;
        }

        System.out.printf("%d %d %d", wCnt, bCnt, gCnt);
    }
}