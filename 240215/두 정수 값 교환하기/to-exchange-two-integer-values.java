import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        printSwap(n, m);
    }

    public static void printSwap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.printf("%d %d", a, b);
    }
}