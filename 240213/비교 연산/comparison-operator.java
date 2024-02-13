import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        func(a >= b);
        func(a > b);
        func(b >= a);
        func(b > a);
        func(a == b);
        func(a != b);
    }

    public static void func(boolean bol) {
        if (bol) System.out.println(1);
        else System.out.println(0);
    }
}