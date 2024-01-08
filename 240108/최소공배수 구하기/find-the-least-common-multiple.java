import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = gcd(Math.min(a, b), Math.max(a, b));
        System.out.print(a * b / gcd);
    }

    public static int gcd(int n, int m) {
        if (m == 0) return n;

        return gcd(m, n % m);
    }
}