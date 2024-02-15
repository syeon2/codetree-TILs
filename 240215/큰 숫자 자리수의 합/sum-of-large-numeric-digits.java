import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(sumAfterMultiple(a, b, c));
    }

    public static int sumAfterMultiple(int a, int b, int c) {
        int prod = a * b * c;

        return recur(prod);
    }

    public static int recur(int n) {
        if (n < 10) return n;

        return recur(n / 10) + (n % 10);
    }
}