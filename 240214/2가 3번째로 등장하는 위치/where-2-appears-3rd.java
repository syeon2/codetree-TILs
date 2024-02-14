import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            int num = sc.nextInt();

            if (num == 2) cnt++;

            if (cnt == 3) {
                System.out.print(i);
                break;
            }
        }
    }
}