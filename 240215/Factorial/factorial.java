import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print(facto(N));
    }

    public static int facto(int n) {
        if (n == 1) return 1;

        return facto(n - 1) * n;
    }
}