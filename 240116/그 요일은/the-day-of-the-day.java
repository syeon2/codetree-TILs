import java.util.Scanner;

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

        int cnt = 0;

        if ((m1 <= m2 && d1 <= d2) || (m1 < m2 && d1 >= d2)) {
            while (!(m1 == m2 && d1 == d2)) {
                cnt++;

                d1++;

                if (d1 == month[m1] + 1) {
                    m1++;
                    d1 = 1;
                }
            }

            int answer = cnt / 7;

            if (getDayNum(day) <= cnt % 7) answer += 1;

            System.out.print(answer);
        } else {
            while (!(m1 == m2 && d1 == d2)) {
                cnt++;

                d1--;

                if (d1 == 0) {
                    m1--;

                    d1 = month[m1];
                }
            }

            int answer = cnt / 7;

            if (getDayNum(day) >= (7 - (cnt % 7)) % 7) answer += 1;

            System.out.print(answer);
        }
    }

    public static int getDayNum(String day) {
        if (day.equals("Mon")) return 0;
        else if (day.equals("Tue")) return 1;
        else if (day.equals("Wed")) return 2;
        else if (day.equals("Thu")) return 3;
        else if (day.equals("Fri")) return 4;
        else if (day.equals("Sat")) return 5;
        else return 6;
    }
}