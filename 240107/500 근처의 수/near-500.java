import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int min = 1000;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if (n < 500) {
                if (max < n) max = n;
            }

            if (n > 500) {
                if (min > n) min = n;
            }
        }

        System.out.print(max + " " + min);
    }
}