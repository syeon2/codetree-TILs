import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if (n == 0) break;
            else if (n % 2 == 0) {
                sum += n;
                cnt++;
            }
        }

        System.out.printf("%d %d", cnt, sum);
    }
}