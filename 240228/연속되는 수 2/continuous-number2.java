import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int cnt = 0;
        int prev = 0;

        int tempCnt = 1;
        for (int t = 0; t < T; t++) {
            int num = sc.nextInt();

            if (num == prev) tempCnt++;
            else {
                if (cnt < tempCnt) cnt = tempCnt;

                tempCnt = 1;
                prev = num;
            }
        }

        System.out.print(cnt);
    }
}