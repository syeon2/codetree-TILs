import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num = n;

        int cnt = 0;

        while (true) {
            System.out.printf("%d ", num);

            if (num % 5 == 0) cnt++;

            if (cnt == 2) break;
            else num += n;
        }
    }
}