import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a <= 11 && b <= 11 && c < 11) System.out.print(-1);
        else {
            int ans = 0;

            int startD = 11;
            int startH = 11;
            int startM = 11;

            while (true) {
                if (startD == a && startH == b && startM == c) break;

                ans++;
                startM++;

                if (startM >= 60) {
                    startH++;
                    startM = 0;
                }

                if (startH >= 24) {
                    startD++;
                    startH = 0;
                }
            }

            System.out.print(ans);
        }
    }
}