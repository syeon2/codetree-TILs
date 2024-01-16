import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int startD = 11;
        int startH = 11;
        int startM = 11;

        int cnt = 0;

        if (startD > a) System.out.print(-1);
        else if (startD == a && startH > b) System.out.print(-1);
        else if (startD == a && startH == b && startM > c) System.out.print(-1);
        else {
            while (!(startD == a && startH == b && startM == c)) {
                cnt++;

                startM++;
                if (startM == 60) {
                    startH++;
                    startM = 0;
                }

                if (startH == 24) {
                    startD++;
                    startH = 0;
                }
            }

            System.out.print(cnt);
        }
    }
}