import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int num = multiplyAll(a, b, c);

        System.out.println(recur(num));
    }

    public static int recur(int n) {
        if (n == 0) return 0;

        int temp = n % 10;

        return temp + recur(n / 10);
    }

    public static int multiplyAll(int...a) {
        int prod = 1;

        for (int i = 0; i < a.length; i++) {
            prod *= a[i];
        }

        return prod;
    }
}