import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char c = 'A';

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k < i; k++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= n - i + 1; k++) {
                System.out.printf("%s ", c++);

                if (c > 'Z') c = 'A';
            }

            System.out.println();
        }
    }
}