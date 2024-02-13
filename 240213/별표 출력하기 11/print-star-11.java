import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n * 2 + 1; i++) {

            for (int k = 1; k <= n * 2 + 1; k++) {
                if (i % 2 == 1 || k % 2 == 1) System.out.print("* ");
                else System.out.print("  ");
            }

            System.out.println();
        }
    }
}