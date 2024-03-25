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

        while (aCnt * A <= C) {
            int bCnt = 0;

            while (aCnt * A + bCnt * B <= C) {
                ans = Math.max(ans, (aCnt * A + bCnt * B));
                bCnt++;
            }

            aCnt++;
        }

        System.out.print(ans);
    }
}