import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a < c && b <= c) {
            System.out.print((b - a) + (d - c));
        } else if (a < c && b > c) {
            System.out.print((b - a) + (d - c) - (b - c));
        } else if (a == c && b == d) {
            System.out.print(b - a);
        } else if (c < a && d <= a) {
            System.out.print((b - a) + (d - c));
        } else if (c < a && d > a) {
            System.out.print((b - a) + (d - c) - (d - a));
        } else if (a < c && b > d) {
            System.out.print(b - a);
        } else {
            System.out.print(d - c);
        }
    }
}