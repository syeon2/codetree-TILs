import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] listPos = new int[N];
        char[] listStr = new char[N];

        int max = 0;

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);

            listPos[i] = n;
            listStr[i] = c;

            max = Math.max(max, n);
        }

        int ans = 0;
        int gPos = 0;
        int hpos = 0;

        char[] list = new char[max + 1];

        for (int i = 0; i < N; i++) {
            list[listPos[i]] = listStr[i];
        }

        for (int start = 0; start < list.length; start++) {

            for (int end = start; end < list.length; end++) {
                if (list[start] == 0 || list[end] == 0) continue;

                int gCnt = 0;
                int hCnt = 0;

                for (int gap = start; gap <= end; gap++) {
                    if (list[gap] == 'G') gCnt++;
                    else if (list[gap] == 'H') hCnt++;
                }

                if ((gCnt == 0 && hCnt > 0) || (hCnt == 0 && gCnt > 0) || (gCnt != 0 && hCnt == gCnt)) {
                    ans = Math.max(ans, end - start);
                }
            }
        }

        System.out.print(ans);
    }
}