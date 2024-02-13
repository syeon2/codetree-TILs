import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int even = 0;
        int three = 0;
        int threeCnt = 0;

        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();

            if (i % 2 == 0) even += num;
            if (i % 3 == 0) {
                three += num;
                threeCnt++;
            }
        }

        double avg = (double) three / threeCnt;

        System.out.printf("%d %.1f", even, avg);
    }
}