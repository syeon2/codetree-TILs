import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            sum += num;
            cnt++;
        }

        double avg = (double) sum / cnt;

        System.out.printf("%d %.1f", sum, avg);
    }
}