import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        gcd(n, m);
    }

    public static void gcd(int n, int m) {
        for (int i = Math.min(n, m); i >= 1; i--) {
            if (n % i == 0 && m % i == 0) {
                System.out.print(i);
                break;
            }
        }
    }
}