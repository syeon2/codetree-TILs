import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < 11 || (a == 11 && b < 11) || (a == 11 && b == 11 && c < 11)) {
            System.out.println("-1");
        } else {
            if (c < 11) {
                b--;
                c = 60 - (11 - c);
            } else c -= 11;

            if (b < 11) {
                a--;
                b = 24 - (11 - b);
            } else b -= 11;

            a -= 11;

            int total = (a * 24 * 60) + (b * 60) + c;

            System.out.print(total);
        }
    }
}