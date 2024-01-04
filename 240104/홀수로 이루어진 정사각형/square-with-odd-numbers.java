import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 11; i < 11 + (n * 2); i += 2) {

            for (int k = 0; k < n; k++) {
                System.out.printf("%d ", i + (k * 2));
            }

            System.out.println();
        }
    }
}