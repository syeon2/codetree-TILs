import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 9;

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= n; k++) {

                System.out.print(cnt--);

                if (cnt == 0) cnt = 9;
            }

            System.out.println();
        }
    }
}