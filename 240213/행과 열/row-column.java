import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i <= a; i++) {

            for (int k = 1; k <= b; k++) {
                System.out.printf("%d ", i * k);
            }

            System.out.println();
        }
    }
}