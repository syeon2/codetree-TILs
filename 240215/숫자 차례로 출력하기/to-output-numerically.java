import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        upPrint(N);
        System.out.println();
        downPrint(N);
    }

    public static void upPrint(int n) {
        if (n == 0) return;

        upPrint(n - 1);

        System.out.printf("%d ", n);
    }

    public static void downPrint(int n) {
        if (n == 0) return;

        System.out.printf("%d ", n);

        downPrint(n - 1);
    }
}