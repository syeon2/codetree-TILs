import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                for (int k = 1; k <= n; k++) {
                    System.out.print("* ");
                }

                System.out.println();
            } else {
                System.out.print("  ");

                int num = i % 2 == 1 ? (n / 2) - (i / 2) : (n / 2) - (i / 2) + 1;

                for (int k = 1; k <= ((n / 2) - num); k++) {
                    System.out.print("    ");
                }

                for (int k = 1; k <= num; k++) {
                    System.out.print("*   ");
                }

                System.out.println();
            }
        }
    }
}