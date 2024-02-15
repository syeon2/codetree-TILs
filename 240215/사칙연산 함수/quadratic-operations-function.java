import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String cmd = sc.next();
        int b = sc.nextInt();

        if (applyCmd(cmd, a, b) == 1000000) System.out.print("False");
        else System.out.printf("%d %s %d = %d", a, cmd, b, applyCmd(cmd, a, b));
    }

    public static int applyCmd(String cmd, int a, int b) {
        if (cmd.equals("+")) return plus(a, b);
        else if (cmd.equals("-")) return minus(a, b);
        else if (cmd.equals("*")) return multiple(a, b);
        else if (cmd.equals("/")) return divide(a, b);

        return 1000000;
    }

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiple(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}