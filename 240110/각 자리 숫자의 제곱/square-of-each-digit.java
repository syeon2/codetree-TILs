import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print(recur(N));
    }

    public static int recur(int n) {
        if (n == 0) return 0;

        int temp = n % 10;

        return (temp * temp) + recur(n / 10);
    }
}