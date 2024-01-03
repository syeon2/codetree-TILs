import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String c = sc.next();
        int n = sc.nextInt();

        if (c.equals("A")) {
            for (int i = 1; i <= n; i++) {
                System.out.printf("%d ", i);
            }
        } else {
            for (int i = n; i >= 1; i--) {
                System.out.printf("%d ", i);
            }
        }
    }
}