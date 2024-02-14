import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        printLcd(n, m);
    }

    public static void printLcd(int n, int m) {
        int start = Math.max(n, m);

        while (true) {
            if (start % n == 0 && start % m == 0) {
                System.out.print(start);
                break;
            } else start++;
        }
    }
}