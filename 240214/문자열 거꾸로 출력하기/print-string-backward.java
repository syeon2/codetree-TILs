import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next();

            if (str.equals("END")) break;

            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }

            System.out.println();
        }
    }
}