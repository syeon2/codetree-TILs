import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        while (n > 1) {
            if (n % 2 == 0) sb.insert(0, "0");
            else sb.insert(0, "1");

            n /= 2;
        }

        if (n == 1) sb.insert(0, "1");

        System.out.print(sb);
    }
}