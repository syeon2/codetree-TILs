import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[] list = new int[203];
        int OFFSET = 100;

        int curPos = OFFSET;

        for (int t = 0; t < T; t++) {
            int num = sc.nextInt();
            char direc = sc.next().charAt(0);

            if (direc == 'R') {
                for (int i = curPos; i <= curPos + num; i++) {
                    list[i]++;
                }

                curPos += num;
            } else {
                for (int i = curPos; i >= curPos - num; i--) {
                    list[i]++;
                }

                curPos -= num;
            }
        }

        int ans = 0;
        boolean lining = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i] >= 2) {
                ans++;
                lining = true;
            } else {
                if (lining) {
                    lining = false;
                    ans--;
                }
            }
        }

        System.out.print(ans);
    }
}