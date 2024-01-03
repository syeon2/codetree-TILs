import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = (a < b) ? a : b;
        min = (b < c) ? b : c;

        if (a == min) System.out.print(1);
        else System.out.print(0);

        System.out.print(" ");

        if (a == b && b == c) System.out.print(1);
        else System.out.print(0);
    }
}