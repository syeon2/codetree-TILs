import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 1;
        int b = n;

        System.out.printf("%d %d ", a, b);

        while (b <= 100) {
            int temp = a + b;

            a = b;
            b = temp;

            System.out.printf("%d ", b);
        }
    }
}