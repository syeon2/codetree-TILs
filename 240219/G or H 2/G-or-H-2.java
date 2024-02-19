import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] line = new char[101];
        int N = sc.nextInt();

        for (int n = 0; n < N; n++) {
            int idx = sc.nextInt();
            char card = sc.next().charAt(0);

            line[idx] = card;
        }

        int ans = 0;

        for (int i = 0; i <= 100; i++) {

            for (int k = 0; k <= 100; k++) {
                if (i + k > 100 || line[k] == 0 || line[k + i] == 0) continue;

                int gCnt = 0;
                int hCnt = 0;

                for (int j = k; j <= k + i; j++) {
                    if (line[j] == 'G') gCnt++;
                    else if (line[j] == 'H') hCnt++;
                }

                if ((gCnt == 0 && hCnt > 0) || (gCnt > 0 && hCnt == 0) || (gCnt != 0 && gCnt == hCnt)) {
                    ans = Math.max(ans, i);
                }
            }
        }

        System.out.print(ans);
    }
}