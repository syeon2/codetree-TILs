import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();
        int d = sc.nextInt();

        int x1 = Math.min(a, c);
        int x2 = Math.max(b, d);

        int line = x2 - x1;

        if (b < c) {
            line -= (c - b);
        } else if (d < a) {
            line -= (a - d);
        }

        System.out.print(line);
    }
}