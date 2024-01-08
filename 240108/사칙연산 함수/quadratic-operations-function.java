import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String command = sc.next();
        int b = sc.nextInt();

        getResult(a, b, command);
    }

    public static void getResult(int a, int b, String command) {
        if (command.equals("+")) {
            System.out.printf("%d + %d = %d", a, b, a * b);
        } else if (command.equals("-")) {
            System.out.printf("%d - %d = %d", a, b, a - b);
        } else if (command.equals("*")) {
            System.out.printf("%d * %d = %d", a, b, a * b);
        } else if (command.equals("/")) {
            System.out.printf("%d / %d = %d", a, b, a / b);
        } else {
            System.out.print("False");
        }
    }
}