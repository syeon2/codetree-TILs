import java.util.Scanner;

public class Main {
    public static int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static String[] dayOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    public static String[] dayOfWeek2 = {"Mon", "Sun", "Sat", "Fri", "Thu", "Wed", "Tue"};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int cnt = 0;

        if ((m1 <= m2 && d1 <= d2) || (m1 < m2 && d1 >= d2)) {
            while (!(m1 == m2 && d1 == d2)) {
                cnt++;

                d1++;

                if (d1 == month[m1]) {
                    d1 = 1;
                    m1++;
                }
            }

            System.out.print(dayOfWeek[cnt % 7]);
        } else {
            while (!(m1 == m2 && d1 == d2)) {
                cnt++;

                d1--;

                if (d1 == 0) {
                    m1--;

                    d1 = month[m1];
                }
            }

            System.out.print(dayOfWeek2[cnt % 7]);
        }
    }
}