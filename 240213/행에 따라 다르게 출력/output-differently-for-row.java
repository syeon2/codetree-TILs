import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= n; k++) {

                if (i % 2 == 1) {
                    System.out.printf("%d ", ++cnt);
                } else {
                    cnt += 2;
                    System.out.printf("%d ", cnt);
                }
            }

            System.out.println();
        }
    }
}