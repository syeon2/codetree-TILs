import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        recur(N);
    }

    public static void recur(int n) {
        if (n == 0) return;

        System.out.printf("%d ", n);

        recur(n - 1);

        System.out.printf("%d ", n);
    }
}