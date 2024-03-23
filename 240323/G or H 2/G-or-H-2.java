import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[] list = new char[101];

        for (int n = 0; n < N; n++) {
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);

            list[pos] = c;
        }

        int ans = 0;

        for (int i = 1; i < 101; i++) {

            for (int k = 0; k < 101 - i; k++) {
                if ((list[k] == 'G' || list[k] == 'H') && (list[k + i] == 'G' || list[k + i] == 'H')) {
                    int gCnt = 0;
                    int hCnt = 0;

                    for (int l = k; l <= k + i; l++) {
                        if (list[l] == 'G') gCnt++;
                        else if (list[l] == 'H') hCnt++;
                    }

                    if ((gCnt > 0 && hCnt == 0) || (hCnt > 0 && gCnt == 0) || (gCnt > 0 && hCnt == gCnt)) ans = Math.max(ans, i);
                }
            }
        }

        System.out.print(ans);
    }
}