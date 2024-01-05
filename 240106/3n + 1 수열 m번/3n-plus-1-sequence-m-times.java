import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            int m = sc.nextInt();

            int cnt = 0;

            while (m != 1) {
                cnt++;

                if (m % 2 == 0) m /= 2;
                else m = m * 3 + 1;
            }

            System.out.println(cnt);
        }
    }
}