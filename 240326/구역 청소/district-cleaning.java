import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();
        int d = sc.nextInt();

        if ((a < c && b < c) || (c < a && d < a)) {
            int total = 0;
            total += (b - a) + (d - c);

            System.out.print(total);
        } else {
            int total = 0;

            if (a < c) {
                total += (b - a) + (d - c) - (b - c);
            } else {
                total += (b - a) + (d - c) - (d - a);
            }

            System.out.print(total);
        }
    }
}