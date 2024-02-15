import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(recur(n));
    }

    public static int recur(int n) {
        if (n < 10) return n * n;

        return recur(n / 10) + ((n % 10) * (n % 10));
    }
}