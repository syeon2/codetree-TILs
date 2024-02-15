import java.util.Scanner;

public class Main {

    public static int[] monthes = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        String day = sc.next();

        int diff = getTotalDay(m2, d2) - getTotalDay(m1, d1);

        int repeatWeek = diff / 7;

        if (day.equals("Mon") && diff % 7 >= 0) repeatWeek++;
        else if (day.equals("Tue") && diff % 7 >= 1) repeatWeek++;
        else if (day.equals("Wed") && diff % 7 >= 2) repeatWeek++;
        else if (day.equals("Thu") && diff % 7 >= 3) repeatWeek++;
        else if (day.equals("Fri") && diff % 7 >= 4) repeatWeek++;
        else if (day.equals("Sat") && diff % 7 >= 5) repeatWeek++;
        else if (day.equals("Sun") && diff % 7 >= 6) repeatWeek++;

        System.out.print(repeatWeek);
    }

    public static int getTotalDay(int month, int day) {
        int total = day;

        for (int i = 1; i < month; i++) {
            total += monthes[i];
        }

        return total;
    }
}