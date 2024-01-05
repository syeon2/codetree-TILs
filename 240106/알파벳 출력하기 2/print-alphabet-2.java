import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {

            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }

            for (int k = 0; k < n - i; k++) {
                System.out.print((char) ('A' + cnt++));
                System.out.print(" ");

                if ('A' + cnt > 'Z') cnt = 0;
            }

            System.out.println();
        }
    }
}