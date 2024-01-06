import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int sum2 = 0;
        int sum3 = 0;

        int cnt3 = 0;

        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt();

            if (i % 2 == 0) sum2 += n;
            if (i % 3 == 0) {
                sum3 += n;
                cnt3++;
            }
        }

        System.out.printf("%d %.1f", sum2, (double) sum3 / cnt3);
    }
}