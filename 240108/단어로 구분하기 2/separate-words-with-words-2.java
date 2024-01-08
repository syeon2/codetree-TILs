import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            String s = sc.next();

            if (i % 2 == 1) System.out.println(s);
        }
    }
}