import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int ans = 0;

        for (int n = 0; n < N; n++) {
            int sum = 0;

            for (int i = 0; i < 4; i++) {
                sum += sc.nextInt();
            }

            double avg = (double) sum / 4;

            if (avg >= 60) {
                System.out.println("pass");
                ans++;
            }
            else System.out.println("fail");
        }

        System.out.println(ans);
    }
}