import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        boolean ans1 = false;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'e' && str.charAt(i + 1) == 'e') ans1 = true;
        }

        boolean ans2 = false;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'a' && str.charAt(i + 1) == 'b') ans2 = true;
        }

        if (ans1) System.out.print("Yes ");
        else System.out.print("No ");

        if (ans2) System.out.print("Yes");
        else System.out.print("No");
    }
}