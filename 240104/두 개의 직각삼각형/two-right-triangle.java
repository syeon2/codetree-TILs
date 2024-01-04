import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {

            // 별
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }

            // 빈칸
            for (int k = 0; k < (n - i) * 2; k++) {
                System.out.print(" ");
            }

            // 별
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}