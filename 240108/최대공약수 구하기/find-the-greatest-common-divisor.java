import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = a;
        if (min > b) min = b;

        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.print(i);
                break;
            }
        }
    }
}