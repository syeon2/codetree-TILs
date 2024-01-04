import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            
            // 짝
            if (i % 2 == 0) {
                for (int k = 0; k < n - (i / 2) + 1; k++) {
                    System.out.print("* ");
                }
            } else {
                for (int k = 0; k < (i + 1) / 2; k++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {

            if (i % 2 == 0) {
                for (int k = 0; k < n - (i / 2) + 1; k++) {
                    System.out.print("* ");
                }
            } else {
                for (int k = 0; k < (i + 1) / 2; k++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}