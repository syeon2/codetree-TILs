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

        if (m1 == m2) System.out.print(d2 - d1 + 1);
        else {
            int ans = 0;

            for (int i = m1 + 1; i < m2; i++) {
                ans += month[i];
            }


            ans += month[m1] - d1 + 1;
            ans += d2;

            System.out.print(ans);
        }
    }
}