import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] list = new int[N][2];

        for (int i = 0; i < N; i++) {
            list[i][0] = sc.nextInt();
            list[i][1] = sc.nextInt();
        }

        int[] xLine = new int[11];
        int[] yLine = new int[11];

        for (int i = 0; i < N; i++) {
            int x = list[i][0];
            int y = list[i][1];

            xLine[x]++;
            yLine[y]++;
        }

        int xCnt = 0;
        int yCnt = 0;
        for (int i = 0; i <= 10; i++) {
            if (xLine[i] >= 2) xCnt++;
            if (yLine[i] >= 2) yCnt++;
        }

        if (xCnt + yCnt >= 3) System.out.print(1);
        else System.out.print(0);
    }
}