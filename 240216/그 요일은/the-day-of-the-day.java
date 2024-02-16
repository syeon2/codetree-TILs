import java.util.Scanner;

public class Main {

    public static int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        String day = sc.next();

        // 시작 날짜와 끝 날짜의 일 수 차를 구한다.
        // 차를 7로 나눈 값은 한주가 몇번 반복되는지를 알 수 있는 값
        // 차를 7로 나누고 난 나머지는 이후 몇일까지 지났는지 알 수 있는 값

        int start = d1;
        for (int i = 1; i < m1; i++) {
            start += month[i];
        }

        int end = d2;
        for (int i = 1; i < m2; i++) {
            end += month[i];
        }

        int diff = end - start;

        int cntDayOfWeek = diff / 7;

        if (day.equals("Mon") && diff % 7 >= 0) cntDayOfWeek++;
        else if (day.equals("Tue") && diff % 7 >= 1) cntDayOfWeek++;
        else if (day.equals("Wed") && diff % 7 >= 2) cntDayOfWeek++;
        else if (day.equals("Thu") && diff % 7 >= 3) cntDayOfWeek++;
        else if (day.equals("Fri") && diff % 7 >= 4) cntDayOfWeek++;
        else if (day.equals("Sat") && diff % 7 >= 5) cntDayOfWeek++;
        else if (day.equals("Sun") && diff % 7 >= 6) cntDayOfWeek++;

        System.out.print(cntDayOfWeek);
    }
}