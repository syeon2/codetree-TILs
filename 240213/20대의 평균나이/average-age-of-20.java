import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;

        while (true) {
            int num = sc.nextInt();

            if (num >= 20 && num <= 29) {
                sum += num;
                cnt++;
            } else break;
        }

        double avg = (double) sum / cnt;

        System.out.printf("%.2f", avg);
    }
}