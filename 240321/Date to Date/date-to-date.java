import java.util.*;

public class Main {

    public static int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int ans = 1;

        int startM = m1;
        int startD = d1;

        while (true) {
            startD++;

            if (month[startM] < startD) {
                startM++;
                startD = 1;
            }

            ans++;
            
            if (startM == m2 && startD == d2) break;
        }

        System.out.print(ans);
    }
}