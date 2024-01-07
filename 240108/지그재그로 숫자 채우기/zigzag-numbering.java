import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int temp = i;

            for (int k = 0; k < m; k++) {
                System.out.printf("%d ", temp);

                if (k == 0 || k % 2 == 0) temp += (n - i) * 2 - 1;
                else temp++;
            }

            System.out.println();
        }
    }
}