import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int OFFSET = 100000;
        int[] line = new int[100001 + OFFSET];

        int curPos = OFFSET;

        for (int n = 0; n < N; n++) {
            int move = sc.nextInt();
            char direc = sc.next().charAt(0);

            if (direc == 'R') {
                int start = curPos;
                int end = curPos + move - 1;

                for (int i = start; i <= end; i++) {
                    line[i] = 2;
                }

                curPos = end;
            } else {
                int start = curPos;
                int end = curPos - move + 1;

                for (int i = start; i >= end; i--) {
                    line[i] = 1;
                }

                curPos = end;
            }
        }

        int wCnt = 0;
        int bCnt = 0;

        for (int i = 0; i < line.length; i++) {
            if (line[i] == 1) wCnt++;
            else if (line[i] == 2) bCnt++;
        }

        System.out.printf("%d %d", wCnt, bCnt);
    }
}