import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 2; i <= 8; i += 2) {

            for (int k = b; k >= a; k--) {
                System.out.printf("%d * %d = %d", k, i, k * i);

                if (k > a) System.out.print(" / ");
            }

            System.out.println();
        }
    }
}