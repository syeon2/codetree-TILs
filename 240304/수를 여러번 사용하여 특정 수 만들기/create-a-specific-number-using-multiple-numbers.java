import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int ans = 0;

        int aCnt = 0;
        while (true) {
            int subA = C - (A * aCnt);

            int bCnt = 0;
            while (true) {
                if (B * (bCnt + 1) <= subA) bCnt++;
                else break;
            }

            ans = Math.max(ans, (A * aCnt) + (B * bCnt));

            if (A * (aCnt + 1) <= C) aCnt++;
            else break;
        }

        System.out.print(ans);
    }
}