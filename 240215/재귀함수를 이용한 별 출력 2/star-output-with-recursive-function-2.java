import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        print(N);
    }

    public static void print(int n) {
        if (n == 0) return;

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }

        System.out.println();

        print(n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }

        System.out.println();
    }
}