import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i <= 9; i++) {

            for (int k = b; k >= a; k--) {
                if (k % 2 == 0) {
                    System.out.printf("%d * %d = %d", k, i, k * i);
                    if (k != (a / 2) * 2) System.out.print(" / ");
                }
            }

            System.out.println();
        }
    }
}