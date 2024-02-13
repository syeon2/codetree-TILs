import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;

        for (int i = n; i >= 1; i--) {

            for (int k = n; k > i; k--) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.printf("%d ", cnt++);

                if (cnt == 10) cnt = 1;
            }

            System.out.println();
        }
    }
}