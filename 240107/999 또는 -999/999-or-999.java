import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int max = -1000;
        int min = 1000;

        while (true) {
            int n = sc.nextInt();

            if (n == 999 || n == -999) break;

            if (n > max) max = n;
            if (n < min) min = n;
        }

        System.out.printf("%d %d", max, min);
    }
}