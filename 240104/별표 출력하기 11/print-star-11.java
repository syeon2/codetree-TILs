import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= (n * 2) + 1; i++) {

            if (i % 2 == 1) {
                for (int k = 0; k < (n * 3) - (n - 1); k++) {
                    System.out.print("* ");
                }
            } else {
                for (int k = 0; k < n + 1; k++) {
                    System.out.print("*   ");
                }
            }

            System.out.println();
        }
    }
}