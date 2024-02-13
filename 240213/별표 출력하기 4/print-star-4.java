import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = n * 2 - 1;

        for (int i = 1; i <= cnt; i++) {

            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }

            if (i <= cnt / 2) n--;
            else n++;

            System.out.println();
        }
    }
}