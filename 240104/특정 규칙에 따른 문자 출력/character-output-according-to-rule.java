import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // 빈칸
            for (int k = 0; k < n - i; k++) {
                System.out.print("  ");
            }

            // 기호
            for (int k = 0; k < i; k++) {
                System.out.print("@ ");
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {

            // 기호
            for (int k = 0; k < i; k++) {
                System.out.print("@ ");
            }

            System.out.println();
        }
    }
}