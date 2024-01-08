import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String s = sc.next();

        while (true) {
            int n = str.indexOf(s);

            if (n == -1) break;
            else {
                str = str.substring(0, n) + str.substring(n + 2);
            }
        }

        System.out.print(str);
    }
}