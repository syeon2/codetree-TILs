import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        operate(a, b);
    }

    public static void operate(int a, int b) {
        if (a > b) {
            System.out.printf("%d %d", a * 2, b + 10);
        } else {
            System.out.printf("%d %d", a + 10, b * 2);
        }
    }
}