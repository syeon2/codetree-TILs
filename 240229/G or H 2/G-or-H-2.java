import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        char[] list = new char[101];
        for (int i = 0; i < N; i++) {
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);

            list[pos] = c;
        }

        int ans = 0;
        for (int i = 1; i <= 100; i++) {

            for (int k = 0; k <= 101 - i; k++) {

                int s = k;
                int e = k + i - 1;

                if ((list[s] == 'G' || list[s] == 'H') && (list[e] == 'G' || list[e] == 'H')) {

                    int gCnt = 0;
                    int hCnt = 0;

                    for (int start = k; start < k + i; start++) {
                        if (list[start] == 'G') gCnt++;
                        else if (list[start] == 'H') hCnt++;
                    }

                    if ((gCnt > 0 && hCnt == 0) || (hCnt > 0 && gCnt == 0) || (gCnt == hCnt)) {
                        ans = Math.max(ans, i);
                    }
                }
            }
        }

        System.out.print(ans - 1);
    }
}