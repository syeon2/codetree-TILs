import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int total = 0;

            for (int k = 0; k < 4; k++) {
                int score = sc.nextInt();

                total += score;
            }

            int avg = total / 4;

            if (avg >= 60) {
                System.out.println("pass");
                cnt++;
            } else System.out.println("fail");
        }

        System.out.print(cnt);
    }
}