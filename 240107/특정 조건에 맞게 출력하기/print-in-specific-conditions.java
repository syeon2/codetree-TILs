import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) break;
            
            if (n % 2 == 1) System.out.printf("%d ", n + 3);
            else System.out.printf("%d ", n / 2);
        }
    }
}