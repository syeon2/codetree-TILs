import java.util.Scanner;

public class Main {

    public static int[] monthes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static String[] dayOfWeeks = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int total1 = d1;
        for (int i = 1; i < m1; i++) {
            total1 += monthes[i];
        }

        int total2 = d2;
        for (int i = 1; i < m2; i++) {
            total2 += monthes[i];
        }

        int diff = Math.abs(total2 - total1);

        int day = diff % 7;

        if (m1 > m2 || (m1 == m2 && d1 > d2)) {
            System.out.print(dayOfWeeks[7 - day]);
        } else System.out.print(dayOfWeeks[day]);        
    }
}