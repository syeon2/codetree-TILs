import java.util.*;

public class Main {

    public static int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static String[] dayOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        String day = sc.next();

        int start = d1;
        for (int i = 1; i < m1; i++) {
            start += month[i];
        }

        int end = d2;
        for (int i = 1; i < m2; i++) {
            end += month[i];
        }

        int sub = end - start;
        int ans = sub / 7 + 1;

        for (int i = 0; i < 7; i++) {
            if (day.equals(month[i]) && sub % 7 >= i) ans++;
        }

        System.out.print(ans);
    }
}